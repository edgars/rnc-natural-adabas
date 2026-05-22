package com.company.naturaladabascli.model;

/**
 * Field definition from a DDM.
 */
public class LegacyField {

    private String name;
    private String type;
    private Integer length;
    private Integer decimals;
    private String descriptor;
    private boolean multipleValue;
    private boolean periodicGroup;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public Integer getDecimals() {
        return decimals;
    }

    public void setDecimals(Integer decimals) {
        this.decimals = decimals;
    }

    public String getDescriptor() {
        return descriptor;
    }

    public void setDescriptor(String descriptor) {
        this.descriptor = descriptor;
    }

    public boolean isMultipleValue() {
        return multipleValue;
    }

    public void setMultipleValue(boolean multipleValue) {
        this.multipleValue = multipleValue;
    }

    public boolean isPeriodicGroup() {
        return periodicGroup;
    }

    public void setPeriodicGroup(boolean periodicGroup) {
        this.periodicGroup = periodicGroup;
    }
}
