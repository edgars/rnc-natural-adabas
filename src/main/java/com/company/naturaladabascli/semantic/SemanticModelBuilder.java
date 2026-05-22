package com.company.naturaladabascli.semantic;

import com.company.naturaladabascli.model.AnalysisResult;

/**
 * Final aggregation pass after per-file drivers have run.
 */
public class SemanticModelBuilder {

    public void build(AnalysisResult result) {
        new ProgramCallResolver().resolve(result);
        CrudMatrixBuilder.build(result);
    }
}
