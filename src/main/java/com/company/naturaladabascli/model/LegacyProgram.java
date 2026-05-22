package com.company.naturaladabascli.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Parsed Natural program summary.
 */
public class LegacyProgram {

    private String name;
    private String relativePath;
    private ArtifactType type;
    private final List<ProgramView> views = new ArrayList<ProgramView>();
    private final List<DataAccess> dataAccesses = new ArrayList<DataAccess>();
    private final List<ProgramCall> calls = new ArrayList<ProgramCall>();
    private final List<BusinessRuleCandidate> ruleCandidates = new ArrayList<BusinessRuleCandidate>();
    private final List<ParseIssue> parseIssues = new ArrayList<ParseIssue>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRelativePath() {
        return relativePath;
    }

    public void setRelativePath(String relativePath) {
        this.relativePath = relativePath;
    }

    public ArtifactType getType() {
        return type;
    }

    public void setType(ArtifactType type) {
        this.type = type;
    }

    public List<ProgramView> getViews() {
        return views;
    }

    public List<DataAccess> getDataAccesses() {
        return dataAccesses;
    }

    public List<ProgramCall> getCalls() {
        return calls;
    }

    public List<BusinessRuleCandidate> getRuleCandidates() {
        return ruleCandidates;
    }

    public List<ParseIssue> getParseIssues() {
        return parseIssues;
    }
}
