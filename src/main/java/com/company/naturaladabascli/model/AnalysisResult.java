package com.company.naturaladabascli.model;

import com.company.naturaladabascli.cli.SourceType;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Aggregated outcome of a full analysis run.
 */
public class AnalysisResult {

    private String source;
    private SourceType sourceType;
    private long startedAt;
    private long finishedAt;
    private final List<SourceArtifact> artifacts = new ArrayList<SourceArtifact>();
    private final List<LegacyProgram> programs = new ArrayList<LegacyProgram>();
    private final List<LegacyEntity> entities = new ArrayList<LegacyEntity>();
    private final List<DataAccess> dataAccesses = new ArrayList<DataAccess>();
    private final List<BusinessRuleCandidate> businessRuleCandidates = new ArrayList<BusinessRuleCandidate>();
    private final List<ProgramCall> programCalls = new ArrayList<ProgramCall>();
    private final List<ParseIssue> parseIssues = new ArrayList<ParseIssue>();
    private final Map<String, Map<String, String>> crudMatrix = new LinkedHashMap<String, Map<String, String>>();

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public SourceType getSourceType() {
        return sourceType;
    }

    public void setSourceType(SourceType sourceType) {
        this.sourceType = sourceType;
    }

    public long getStartedAt() {
        return startedAt;
    }

    public void setStartedAt(long startedAt) {
        this.startedAt = startedAt;
    }

    public long getFinishedAt() {
        return finishedAt;
    }

    public void setFinishedAt(long finishedAt) {
        this.finishedAt = finishedAt;
    }

    public List<SourceArtifact> getArtifacts() {
        return artifacts;
    }

    public List<LegacyProgram> getPrograms() {
        return programs;
    }

    public List<LegacyEntity> getEntities() {
        return entities;
    }

    public List<DataAccess> getDataAccesses() {
        return dataAccesses;
    }

    public List<BusinessRuleCandidate> getBusinessRuleCandidates() {
        return businessRuleCandidates;
    }

    public List<ProgramCall> getProgramCalls() {
        return programCalls;
    }

    public List<ParseIssue> getParseIssues() {
        return parseIssues;
    }

    public Map<String, Map<String, String>> getCrudMatrix() {
        return crudMatrix;
    }
}
