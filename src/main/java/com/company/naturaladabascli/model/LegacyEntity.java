package com.company.naturaladabascli.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Logical entity from a DDM (or inferred).
 */
public class LegacyEntity {

    private String name;
    private String physicalName;
    private String dbid;
    private String fnr;
    private final List<LegacyField> fields = new ArrayList<LegacyField>();
    private String sourcePath;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhysicalName() {
        return physicalName;
    }

    public void setPhysicalName(String physicalName) {
        this.physicalName = physicalName;
    }

    public String getDbid() {
        return dbid;
    }

    public void setDbid(String dbid) {
        this.dbid = dbid;
    }

    public String getFnr() {
        return fnr;
    }

    public void setFnr(String fnr) {
        this.fnr = fnr;
    }

    public List<LegacyField> getFields() {
        return fields;
    }

    public String getSourcePath() {
        return sourcePath;
    }

    public void setSourcePath(String sourcePath) {
        this.sourcePath = sourcePath;
    }
}
