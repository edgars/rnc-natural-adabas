package com.company.naturaladabascli.drivers.natural;

import com.company.naturaladabascli.model.BusinessRuleCandidate;
import com.company.naturaladabascli.model.SourceLocation;
import org.antlr.v4.runtime.ParserRuleContext;

/**
 * Heuristic extraction of rule-shaped syntax (evidence only).
 */
public final class NaturalRuleCandidateExtractor {

    private NaturalRuleCandidateExtractor() {
    }

    public static BusinessRuleCandidate ifRule(String program, String relativePath, ParserRuleContext ctx,
                                                 String condition, String action, String raw, String ruleType) {
        BusinessRuleCandidate b = new BusinessRuleCandidate();
        b.setProgramName(program);
        b.setRuleType(ruleType);
        b.setConditionExpression(condition);
        b.setActionExpression(action);
        b.setRawCode(raw);
        b.setSourceLocation(loc(relativePath, ctx));
        b.setConfidence("HEURISTIC");
        return b;
    }

    public static BusinessRuleCandidate computeRule(String program, String relativePath, ParserRuleContext ctx,
                                                    String formula, String raw) {
        BusinessRuleCandidate b = new BusinessRuleCandidate();
        b.setProgramName(program);
        b.setRuleType("CALCULATION");
        b.setConditionExpression("");
        b.setActionExpression(formula);
        b.setRawCode(raw);
        b.setSourceLocation(loc(relativePath, ctx));
        b.setConfidence("HEURISTIC");
        return b;
    }

    public static BusinessRuleCandidate decideRule(String program, String relativePath, ParserRuleContext ctx, String raw) {
        BusinessRuleCandidate b = new BusinessRuleCandidate();
        b.setProgramName(program);
        b.setRuleType("CLASSIFICATION");
        b.setConditionExpression("");
        b.setActionExpression("");
        b.setRawCode(raw);
        b.setSourceLocation(loc(relativePath, ctx));
        b.setConfidence("HEURISTIC");
        return b;
    }

    public static BusinessRuleCandidate reinputRule(String program, String relativePath, ParserRuleContext ctx,
                                                    String raw) {
        BusinessRuleCandidate b = new BusinessRuleCandidate();
        b.setProgramName(program);
        b.setRuleType("VALIDATION_ERROR");
        b.setConditionExpression("");
        b.setActionExpression("");
        b.setRawCode(raw);
        b.setSourceLocation(loc(relativePath, ctx));
        b.setConfidence("HEURISTIC");
        return b;
    }

    private static SourceLocation loc(String relativePath, ParserRuleContext ctx) {
        int line = ctx.start != null ? ctx.start.getLine() : 0;
        int col = ctx.start != null ? ctx.start.getCharPositionInLine() + 1 : 0;
        return new SourceLocation(relativePath, line, col);
    }
}
