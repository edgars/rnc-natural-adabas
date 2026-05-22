package com.company.naturaladabascli.model;

/**
 * Inferred data access against a view or entity.
 */
public class DataAccess {

    private String programName;
    private String entityOrViewName;
    private String resolvedEntityName;
    private CrudOperation operation;
    private String statementType;
    private String conditionExpression;
    private String rawCode;
    private SourceLocation sourceLocation;

    public String getProgramName() {
        return programName;
    }

    public void setProgramName(String programName) {
        this.programName = programName;
    }

    public String getEntityOrViewName() {
        return entityOrViewName;
    }

    public void setEntityOrViewName(String entityOrViewName) {
        this.entityOrViewName = entityOrViewName;
    }

    public String getResolvedEntityName() {
        return resolvedEntityName;
    }

    public void setResolvedEntityName(String resolvedEntityName) {
        this.resolvedEntityName = resolvedEntityName;
    }

    public CrudOperation getOperation() {
        return operation;
    }

    public void setOperation(CrudOperation operation) {
        this.operation = operation;
    }

    public String getStatementType() {
        return statementType;
    }

    public void setStatementType(String statementType) {
        this.statementType = statementType;
    }

    public String getConditionExpression() {
        return conditionExpression;
    }

    public void setConditionExpression(String conditionExpression) {
        this.conditionExpression = conditionExpression;
    }

    public String getRawCode() {
        return rawCode;
    }

    public void setRawCode(String rawCode) {
        this.rawCode = rawCode;
    }

    public SourceLocation getSourceLocation() {
        return sourceLocation;
    }

    public void setSourceLocation(SourceLocation sourceLocation) {
        this.sourceLocation = sourceLocation;
    }
}
