package com.company.naturaladabascli.drivers;

import com.company.naturaladabascli.model.AnalysisResult;
import com.company.naturaladabascli.model.SourceArtifact;

/**
 * Pluggable analyzer for a legacy technology stack.
 */
public interface TechnologyAnalyzer {

    boolean supports(SourceArtifact artifact);

    void analyze(SourceArtifact artifact, AnalysisResult result);
}
