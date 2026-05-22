package com.company.naturaladabascli.drivers.natural;

import com.company.naturaladabascli.antlr.NaturalDdmParser;
import com.company.naturaladabascli.antlr.NaturalParser;
import com.company.naturaladabascli.model.AnalysisResult;
import com.company.naturaladabascli.model.ArtifactType;
import com.company.naturaladabascli.model.LegacyEntity;
import com.company.naturaladabascli.model.LegacyProgram;
import com.company.naturaladabascli.model.ParseIssue;
import com.company.naturaladabascli.model.ParseStatus;
import com.company.naturaladabascli.model.SourceArtifact;
import com.company.naturaladabascli.parser.NaturalDdmParserService;
import com.company.naturaladabascli.parser.NaturalParserService;
import com.company.naturaladabascli.drivers.TechnologyAnalyzer;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/**
 * Natural/Adabas-specific static analysis driver.
 */
public class NaturalAdabasAnalyzer implements TechnologyAnalyzer {

    private final NaturalParserService naturalParserService = new NaturalParserService();
    private final NaturalDdmParserService ddmParserService = new NaturalDdmParserService();

    @Override
    public boolean supports(SourceArtifact artifact) {
        ArtifactType t = artifact.getArtifactType();
        return t == ArtifactType.NATURAL_DDM
                || t == ArtifactType.NATURAL_PROGRAM
                || t == ArtifactType.NATURAL_COPYCODE;
    }

    @Override
    public void analyze(SourceArtifact artifact, AnalysisResult result) {
        if (!supports(artifact)) {
            return;
        }
        if (artifact.getArtifactType() == ArtifactType.NATURAL_DDM) {
            analyzeDdm(artifact, result);
            return;
        }
        analyzeProgram(artifact, result);
    }

    private void analyzeDdm(SourceArtifact artifact, AnalysisResult result) {
        java.util.List<ParseIssue> localIssues = new java.util.ArrayList<ParseIssue>();
        try {
            NaturalDdmParser.DdmFileContext tree = ddmParserService.parse(
                    artifact.getContent(), artifact.getRelativePath(), localIssues);
            LegacyEntity entity = new LegacyEntity();
            entity.setSourcePath(artifact.getRelativePath());
            new NaturalDdmVisitor(entity).visit(tree);
            mergeEntity(result, entity);
        } catch (Exception ex) {
            ParseIssue pi = new ParseIssue();
            pi.setArtifactPath(artifact.getRelativePath());
            pi.setLine(0);
            pi.setColumn(0);
            pi.setMessage(ex.getMessage());
            pi.setSeverity("ERROR");
            localIssues.add(pi);
        }
        result.getParseIssues().addAll(localIssues);
        updateArtifactParseStatus(artifact, localIssues);
    }

    private void analyzeProgram(SourceArtifact artifact, AnalysisResult result) {
        java.util.List<ParseIssue> localIssues = new java.util.ArrayList<ParseIssue>();
        LegacyProgram program = new LegacyProgram();
        program.setName(programNameFromFile(artifact.getFileName()));
        program.setRelativePath(artifact.getRelativePath());
        program.setType(artifact.getArtifactType());
        try {
            NaturalParser.ProgramContext tree = naturalParserService.parse(
                    artifact.getContent(), artifact.getRelativePath(), localIssues);
            Map<String, LegacyEntity> entitiesUpper = indexEntities(result);
            NaturalProgramVisitor visitor = new NaturalProgramVisitor(
                    program, artifact.getRelativePath(), program.getName(), entitiesUpper);
            visitor.visit(tree);
        } catch (Exception ex) {
            ParseIssue pi = new ParseIssue();
            pi.setArtifactPath(artifact.getRelativePath());
            pi.setLine(0);
            pi.setColumn(0);
            pi.setMessage(ex.getMessage());
            pi.setSeverity("ERROR");
            localIssues.add(pi);
        }
        result.getParseIssues().addAll(localIssues);
        result.getPrograms().add(program);
        result.getDataAccesses().addAll(program.getDataAccesses());
        result.getProgramCalls().addAll(program.getCalls());
        result.getBusinessRuleCandidates().addAll(program.getRuleCandidates());
        updateArtifactParseStatus(artifact, localIssues);
    }

    private static Map<String, LegacyEntity> indexEntities(AnalysisResult result) {
        Map<String, LegacyEntity> map = new HashMap<String, LegacyEntity>();
        for (LegacyEntity e : result.getEntities()) {
            if (e.getName() != null) {
                map.put(e.getName().toUpperCase(Locale.ROOT), e);
            }
        }
        return map;
    }

    private static void mergeEntity(AnalysisResult result, LegacyEntity incoming) {
        if (incoming.getName() == null) {
            return;
        }
        String key = incoming.getName().toUpperCase(Locale.ROOT);
        for (LegacyEntity existing : result.getEntities()) {
            if (key.equals(existing.getName().toUpperCase(Locale.ROOT))) {
                existing.getFields().addAll(incoming.getFields());
                if (incoming.getDbid() != null) {
                    existing.setDbid(incoming.getDbid());
                }
                if (incoming.getFnr() != null) {
                    existing.setFnr(incoming.getFnr());
                }
                return;
            }
        }
        result.getEntities().add(incoming);
    }

    private static String programNameFromFile(String fileName) {
        if (fileName == null) {
            return "";
        }
        int dot = fileName.lastIndexOf('.');
        if (dot > 0) {
            return fileName.substring(0, dot);
        }
        return fileName;
    }

    private static void updateArtifactParseStatus(SourceArtifact artifact, java.util.List<ParseIssue> localIssues) {
        if (localIssues.isEmpty()) {
            return;
        }
        artifact.setParseStatus(ParseStatus.PARTIAL);
    }
}
