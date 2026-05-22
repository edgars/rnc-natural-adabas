package com.company.naturaladabascli.drivers.natural;

import com.company.naturaladabascli.antlr.NaturalParser;
import com.company.naturaladabascli.antlr.NaturalParserBaseVisitor;
import com.company.naturaladabascli.model.BusinessRuleCandidate;
import com.company.naturaladabascli.model.CrudOperation;
import com.company.naturaladabascli.model.DataAccess;
import com.company.naturaladabascli.model.LegacyEntity;
import com.company.naturaladabascli.model.LegacyProgram;
import com.company.naturaladabascli.model.ProgramCall;
import com.company.naturaladabascli.model.ProgramView;
import com.company.naturaladabascli.model.SourceLocation;
import org.antlr.v4.runtime.ParserRuleContext;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/**
 * Walks a Natural parse tree and fills {@link LegacyProgram} structures.
 */
public class NaturalProgramVisitor extends NaturalParserBaseVisitor<Void> {

    private final LegacyProgram program;
    private final String relativePath;
    private final String programName;
    private final Map<String, LegacyEntity> entitiesByNameUpper;

    private final Map<String, String> viewToEntity = new HashMap<String, String>();

    public NaturalProgramVisitor(LegacyProgram program, String relativePath, String programName,
                                 Map<String, LegacyEntity> entitiesByNameUpper) {
        this.program = program;
        this.relativePath = relativePath;
        this.programName = programName;
        this.entitiesByNameUpper = entitiesByNameUpper == null
                ? new HashMap<String, LegacyEntity>()
                : entitiesByNameUpper;
    }

    @Override
    public Void visitDefineData(NaturalParser.DefineDataContext ctx) {
        return super.visitDefineData(ctx);
    }

    @Override
    public Void visitDefineLine(NaturalParser.DefineLineContext ctx) {
        if (ctx.VIEW() != null && ctx.ID().size() >= 2) {
            String view = ctx.ID(0).getText().toUpperCase(Locale.ROOT);
            String entity = ctx.ID(1).getText().toUpperCase(Locale.ROOT);
            viewToEntity.put(view, entity);
            ProgramView pv = new ProgramView(ctx.ID(0).getText(), ctx.ID(1).getText());
            program.getViews().add(pv);
        }
        return null;
    }

    @Override
    public Void visitFindStatement(NaturalParser.FindStatementContext ctx) {
        String view = ctx.ID().getText();
        String cond = "";
        if (ctx.WITH() != null && ctx.expr() != null) {
            cond = ctx.expr().getText();
        }
        addAccess("FIND", NaturalCrudExtractor.forFindReadGetHistogram("FIND"), view, cond, ctx);
        return super.visitFindStatement(ctx);
    }

    @Override
    public Void visitReadLikeStatement(NaturalParser.ReadLikeStatementContext ctx) {
        String verb = ctx.READ() != null ? "READ" : "GET";
        String view = ctx.ID().getText();
        String cond = "";
        if (ctx.WITH() != null && ctx.expr() != null) {
            cond = ctx.expr().getText();
        }
        addAccess(verb, NaturalCrudExtractor.forFindReadGetHistogram(verb), view, cond, ctx);
        return null;
    }

    @Override
    public Void visitHistogramStatement(NaturalParser.HistogramStatementContext ctx) {
        String view = ctx.ID().getText();
        String cond = "";
        if (ctx.WITH() != null && ctx.expr() != null) {
            cond = ctx.expr().getText();
        }
        addAccess("HISTOGRAM", NaturalCrudExtractor.forFindReadGetHistogram("HISTOGRAM"), view, cond, ctx);
        return null;
    }

    @Override
    public Void visitStoreStatement(NaturalParser.StoreStatementContext ctx) {
        String view = ctx.ID().getText();
        addAccess("STORE", NaturalCrudExtractor.forStore(), view, "", ctx);
        return null;
    }

    @Override
    public Void visitUpdateStatement(NaturalParser.UpdateStatementContext ctx) {
        addAccess("UPDATE", NaturalCrudExtractor.forUpdate(), "", "", ctx);
        return null;
    }

    @Override
    public Void visitDeleteStatement(NaturalParser.DeleteStatementContext ctx) {
        addAccess("DELETE", NaturalCrudExtractor.forDelete(), "", "", ctx);
        return null;
    }

    @Override
    public Void visitCallnatStatement(NaturalParser.CallnatStatementContext ctx) {
        if (ctx.STRING() != null) {
            ProgramCall c = NaturalCallExtractor.callNat(programName, relativePath, ctx, ctx.STRING().getText());
            program.getCalls().add(c);
        }
        return null;
    }

    @Override
    public Void visitPerformStatement(NaturalParser.PerformStatementContext ctx) {
        if (ctx.ID() != null) {
            ProgramCall c = NaturalCallExtractor.perform(programName, relativePath, ctx, ctx.ID().getText());
            program.getCalls().add(c);
        }
        return null;
    }

    @Override
    public Void visitIncludeStatement(NaturalParser.IncludeStatementContext ctx) {
        if (ctx.ID() != null) {
            ProgramCall c = NaturalCallExtractor.include(programName, relativePath, ctx, ctx.ID().getText());
            program.getCalls().add(c);
        }
        return null;
    }

    @Override
    public Void visitComputeStatement(NaturalParser.ComputeStatementContext ctx) {
        String formula = ctx.expr() != null ? ctx.expr().getText() : "";
        BusinessRuleCandidate b = NaturalRuleCandidateExtractor.computeRule(
                programName, relativePath, ctx, formula, ctx.getText());
        program.getRuleCandidates().add(b);
        return null;
    }

    @Override
    public Void visitIfStatement(NaturalParser.IfStatementContext ctx) {
        if (ctx.expr() != null) {
            String cond = ctx.expr().getText();
            String raw = ctx.getText();
            String upper = raw.toUpperCase(Locale.ROOT);
            String ruleType = upper.contains("REINPUT") ? "VALIDATION" : "CONDITIONAL";
            String action = extractActionSnippet(raw);
            program.getRuleCandidates().add(
                    NaturalRuleCandidateExtractor.ifRule(programName, relativePath, ctx, cond, action, raw, ruleType));
        }
        return super.visitIfStatement(ctx);
    }

    @Override
    public Void visitDecideStatement(NaturalParser.DecideStatementContext ctx) {
        program.getRuleCandidates().add(
                NaturalRuleCandidateExtractor.decideRule(programName, relativePath, ctx, ctx.getText()));
        return super.visitDecideStatement(ctx);
    }

    @Override
    public Void visitReinputStatement(NaturalParser.ReinputStatementContext ctx) {
        program.getRuleCandidates().add(
                NaturalRuleCandidateExtractor.reinputRule(programName, relativePath, ctx, ctx.getText()));
        return null;
    }

    private String extractActionSnippet(String raw) {
        String u = raw.toUpperCase(Locale.ROOT);
        int ri = u.indexOf("REINPUT");
        if (ri >= 0) {
            return clip(raw, ri, 120);
        }
        int wr = u.indexOf("WRITE");
        if (wr >= 0) {
            return clip(raw, wr, 120);
        }
        int mv = u.indexOf("MOVE");
        if (mv >= 0) {
            return clip(raw, mv, 120);
        }
        int cp = u.indexOf("COMPUTE");
        if (cp >= 0) {
            return clip(raw, cp, 120);
        }
        int es = u.indexOf("ESCAPE");
        if (es >= 0) {
            return clip(raw, es, 120);
        }
        return "";
    }

    private static String clip(String raw, int start, int maxLen) {
        int end = Math.min(raw.length(), start + maxLen);
        return raw.substring(start, end);
    }

    private void addAccess(String statementType, CrudOperation op,
                           String entityOrView, String condition, ParserRuleContext ctx) {
        DataAccess da = new DataAccess();
        da.setProgramName(programName);
        da.setEntityOrViewName(entityOrView);
        da.setResolvedEntityName(resolveEntity(entityOrView));
        da.setOperation(op);
        da.setStatementType(statementType);
        da.setConditionExpression(condition);
        da.setRawCode(ctx.getText());
        int line = ctx.start != null ? ctx.start.getLine() : 0;
        int col = ctx.start != null ? ctx.start.getCharPositionInLine() + 1 : 0;
        da.setSourceLocation(new SourceLocation(relativePath, line, col));
        program.getDataAccesses().add(da);
    }

    private String resolveEntity(String viewOrEntity) {
        if (viewOrEntity == null || viewOrEntity.isEmpty()) {
            return "";
        }
        String key = viewOrEntity.toUpperCase(Locale.ROOT);
        if (viewToEntity.containsKey(key)) {
            return viewToEntity.get(key);
        }
        if (entitiesByNameUpper.containsKey(key)) {
            return entitiesByNameUpper.get(key).getName();
        }
        return viewOrEntity;
    }
}

