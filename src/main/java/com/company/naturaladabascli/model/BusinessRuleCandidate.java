package com.company.naturaladabascli.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Heuristic business rule extracted from syntax (evidence-based only).
 */
public class BusinessRuleCandidate {

    private String programName;
    private String ruleType;
    private String conditionExpression;
    private String actionExpression;
    private String rawCode;
    private final List<String> fieldsInvolved = new ArrayList<String>();
    private SourceLocation sourceLocation;
    private String confidence;

    public String getProgramName() {
        return programName;
    }

    public void setProgramName(String programName) {
        this.programName = programName;
    }

    public String getRuleType() {
        return ruleType;
    }

    public void setRuleType(String ruleType) {
        this.ruleType = ruleType;
    }

    public String getConditionExpression() {
        return conditionExpression;
    }

    public void setConditionExpression(String conditionExpression) {
        this.conditionExpression = conditionExpression;
    }

    public String getActionExpression() {
        return actionExpression;
    }

    public void setActionExpression(String actionExpression) {
        this.actionExpression = actionExpression;
    }

    public String getRawCode() {
        return rawCode;
    }

    public void setRawCode(String rawCode) {
        this.rawCode = rawCode;
    }

    public List<String> getFieldsInvolved() {
        return fieldsInvolved;
    }

    public SourceLocation getSourceLocation() {
        return sourceLocation;
    }

    public void setSourceLocation(SourceLocation sourceLocation) {
        this.sourceLocation = sourceLocation;
    }

    public String getConfidence() {
        return confidence;
    }

    public void setConfidence(String confidence) {
        this.confidence = confidence;
    }
}
