package com.company.naturaladabascli.model;

/**
 * Line/column reference inside a source file.
 */
public class SourceLocation {

    private String filePath;
    private int line;
    private int column;

    public SourceLocation() {
    }

    public SourceLocation(String filePath, int line, int column) {
        this.filePath = filePath;
        this.line = line;
        this.column = column;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public int getLine() {
        return line;
    }

    public void setLine(int line) {
        this.line = line;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }
}
