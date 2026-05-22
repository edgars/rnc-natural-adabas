package com.company.naturaladabascli.parser;

import com.company.naturaladabascli.model.ParseIssue;
import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

import java.util.List;

/**
 * Collects lexer/parser diagnostics into {@link ParseIssue} records.
 */
public class ParserIssueListener extends BaseErrorListener {

    private final String artifactPath;
    private final List<ParseIssue> issues;

    public ParserIssueListener(String artifactPath, List<ParseIssue> issues) {
        this.artifactPath = artifactPath;
        this.issues = issues;
    }

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine,
                            String msg, RecognitionException e) {
        ParseIssue pi = new ParseIssue();
        pi.setArtifactPath(artifactPath);
        pi.setLine(line);
        pi.setColumn(charPositionInLine + 1);
        pi.setMessage(msg);
        pi.setSeverity("ERROR");
        issues.add(pi);
    }
}
