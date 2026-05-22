package com.company.naturaladabascli.drivers.natural;

import com.company.naturaladabascli.model.ProgramCall;
import com.company.naturaladabascli.model.SourceLocation;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.TerminalNode;

/**
 * Builds {@link ProgramCall} records from parse contexts.
 */
public final class NaturalCallExtractor {

    private NaturalCallExtractor() {
    }

    public static ProgramCall callNat(String sourceProgram, String relativePath, ParserRuleContext ctx, String literal) {
        ProgramCall c = new ProgramCall();
        c.setSourceProgram(sourceProgram);
        c.setCallType("CALLNAT");
        c.setTargetProgram(stripQuotes(literal));
        c.setSourceLocation(loc(relativePath, ctx));
        return c;
    }

    public static ProgramCall perform(String sourceProgram, String relativePath, ParserRuleContext ctx, String target) {
        ProgramCall c = new ProgramCall();
        c.setSourceProgram(sourceProgram);
        c.setCallType("PERFORM");
        c.setTargetProgram(target);
        c.setSourceLocation(loc(relativePath, ctx));
        return c;
    }

    public static ProgramCall include(String sourceProgram, String relativePath, ParserRuleContext ctx, String target) {
        ProgramCall c = new ProgramCall();
        c.setSourceProgram(sourceProgram);
        c.setCallType("INCLUDE");
        c.setTargetProgram(target);
        c.setSourceLocation(loc(relativePath, ctx));
        return c;
    }

    private static SourceLocation loc(String relativePath, ParserRuleContext ctx) {
        int line = ctx.start != null ? ctx.start.getLine() : 0;
        int col = ctx.start != null ? ctx.start.getCharPositionInLine() + 1 : 0;
        return new SourceLocation(relativePath, line, col);
    }

    public static String stripQuotes(String s) {
        if (s == null) {
            return "";
        }
        String t = s.trim();
        if (t.length() >= 2 && t.charAt(0) == '\'' && t.charAt(t.length() - 1) == '\'') {
            return t.substring(1, t.length() - 1);
        }
        return t;
    }

    public static String text(TerminalNode node) {
        return node == null ? "" : node.getText();
    }
}
