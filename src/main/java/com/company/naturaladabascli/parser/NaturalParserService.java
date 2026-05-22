package com.company.naturaladabascli.parser;

import com.company.naturaladabascli.antlr.NaturalLexer;
import com.company.naturaladabascli.antlr.NaturalParser;
import com.company.naturaladabascli.model.ParseIssue;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.DefaultErrorStrategy;
import org.antlr.v4.runtime.atn.PredictionMode;

import java.util.List;

/**
 * Builds ANTLR parse trees for Natural programs.
 */
public class NaturalParserService {

    public NaturalParser.ProgramContext parse(String content, String artifactPath, List<ParseIssue> issues) {
        NaturalLexer lexer = new NaturalLexer(CharStreams.fromString(content));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        NaturalParser parser = new NaturalParser(tokens);
        parser.removeErrorListeners();
        parser.addErrorListener(new ParserIssueListener(artifactPath, issues));
        parser.setErrorHandler(new DefaultErrorStrategy());
        parser.getInterpreter().setPredictionMode(PredictionMode.LL);
        return parser.program();
    }
}
