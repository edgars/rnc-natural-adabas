package com.company.naturaladabascli.model;

/**
 * VIEW OF mapping inside a Natural program.
 */
public class ProgramView {

    private String viewName;
    private String entityName;

    public ProgramView() {
    }

    public ProgramView(String viewName, String entityName) {
        this.viewName = viewName;
        this.entityName = entityName;
    }

    public String getViewName() {
        return viewName;
    }

    public void setViewName(String viewName) {
        this.viewName = viewName;
    }

    public String getEntityName() {
        return entityName;
    }

    public void setEntityName(String entityName) {
        this.entityName = entityName;
    }
}
