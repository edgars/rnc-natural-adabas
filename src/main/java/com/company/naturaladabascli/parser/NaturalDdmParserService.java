package com.company.naturaladabascli.parser;

import com.company.naturaladabascli.antlr.NaturalDdmLexer;
import com.company.naturaladabascli.antlr.NaturalDdmParser;
import com.company.naturaladabascli.model.ParseIssue;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.DefaultErrorStrategy;
import org.antlr.v4.runtime.atn.PredictionMode;

import java.util.List;

/**
 * Builds ANTLR parse trees for DDM sources.
 */
public class NaturalDdmParserService {

    public NaturalDdmParser.DdmFileContext parse(String content, String artifactPath, List<ParseIssue> issues) {
        NaturalDdmLexer lexer = new NaturalDdmLexer(CharStreams.fromString(content));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        NaturalDdmParser parser = new NaturalDdmParser(tokens);
        parser.removeErrorListeners();
        parser.addErrorListener(new ParserIssueListener(artifactPath, issues));
        parser.setErrorHandler(new DefaultErrorStrategy());
        parser.getInterpreter().setPredictionMode(PredictionMode.LL);
        return parser.ddmFile();
    }
}
