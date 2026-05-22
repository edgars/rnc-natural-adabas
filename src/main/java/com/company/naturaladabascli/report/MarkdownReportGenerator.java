package com.company.naturaladabascli.report;

import com.company.naturaladabascli.model.AnalysisResult;
import com.company.naturaladabascli.model.ArtifactType;
import com.company.naturaladabascli.model.BusinessRuleCandidate;
import com.company.naturaladabascli.model.DataAccess;
import com.company.naturaladabascli.model.LegacyEntity;
import com.company.naturaladabascli.model.LegacyField;
import com.company.naturaladabascli.model.LegacyProgram;
import com.company.naturaladabascli.model.ParseIssue;
import com.company.naturaladabascli.model.ProgramCall;
import com.company.naturaladabascli.model.SourceArtifact;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;

/**
 * Renders {@link AnalysisResult} into the canonical Markdown report layout.
 */
public class MarkdownReportGenerator {

    public String generate(AnalysisResult result) {
        StringBuilder md = new StringBuilder();
        md.append("# Natural/Adabas Analysis Report\n\n");

        int totalFiles = result.getArtifacts().size();
        int ddms = countArtifacts(result, ArtifactType.NATURAL_DDM);
        int entities = result.getEntities().size();
        int fields = countFields(result);
        int accesses = result.getDataAccesses().size();
        int calls = result.getProgramCalls().size();
        int rules = result.getBusinessRuleCandidates().size();
        int issues = result.getParseIssues().size();

        md.append("## 1. Executive Summary\n\n");
        md.append("- Source: ").append(MarkdownTableBuilder.escapeCell(result.getSource())).append("\n");
        md.append("- Source type: ").append(result.getSourceType() == null ? "" : result.getSourceType().name()).append("\n");
        md.append("- Analysis date: ").append(formatDate(result.getFinishedAt())).append("\n");
        md.append("- Total files scanned: ").append(totalFiles).append("\n");
        md.append("- Natural programs found: ").append(result.getPrograms().size()).append("\n");
        md.append("- DDMs found: ").append(ddms).append("\n");
        md.append("- Data entities found: ").append(entities).append("\n");
        md.append("- Data fields found: ").append(fields).append("\n");
        md.append("- Data accesses found: ").append(accesses).append("\n");
        md.append("- Program calls found: ").append(calls).append("\n");
        md.append("- Business rule candidates found: ").append(rules).append("\n");
        md.append("- Parse issues found: ").append(issues).append("\n\n");

        md.append("## 2. Source Inventory\n\n");
        md.append(MarkdownTableBuilder.row("File", "Type", "Encoding", "Status"));
        md.append(MarkdownTableBuilder.row("---", "---", "---", "---"));
        for (SourceArtifact a : result.getArtifacts()) {
            md.append(MarkdownTableBuilder.row(
                    a.getRelativePath(),
                    a.getArtifactType().name(),
                    a.getEncoding(),
                    a.getParseStatus().name()));
        }
        md.append("\n");

        md.append("## 3. Programs Found\n\n");
        md.append(MarkdownTableBuilder.row("Program", "File", "Views", "Data Accesses", "Calls", "Rule Candidates"));
        md.append(MarkdownTableBuilder.row("---", "---", "---", "---", "---", "---"));
        for (LegacyProgram p : result.getPrograms()) {
            md.append(MarkdownTableBuilder.row(
                    p.getName(),
                    p.getRelativePath(),
                    String.valueOf(p.getViews().size()),
                    String.valueOf(p.getDataAccesses().size()),
                    String.valueOf(p.getCalls().size()),
                    String.valueOf(p.getRuleCandidates().size())));
        }
        md.append("\n");

        md.append("## 4. DDMs and Data Model\n\n");
        for (LegacyEntity e : result.getEntities()) {
            md.append("### Entity: ").append(MarkdownTableBuilder.escapeCell(e.getName())).append("\n\n");
            md.append(MarkdownTableBuilder.row("Field", "Type", "Length", "Decimals", "Descriptor"));
            md.append(MarkdownTableBuilder.row("---", "---", "---:", "---:", "---"));
            for (LegacyField f : e.getFields()) {
                md.append(MarkdownTableBuilder.row(
                        f.getName(),
                        f.getType(),
                        f.getLength() == null ? "" : String.valueOf(f.getLength()),
                        f.getDecimals() == null ? "" : String.valueOf(f.getDecimals()),
                        f.getDescriptor() == null ? "" : f.getDescriptor()));
            }
            md.append("\n");
        }

        md.append("## 5. CRUD Matrix\n\n");
        appendCrudMatrix(md, result);
        md.append("\n");

        md.append("## 6. Data Accesses\n\n");
        md.append(MarkdownTableBuilder.row("Program", "Operation", "Entity/View", "Resolved Entity", "Condition", "Line"));
        md.append(MarkdownTableBuilder.row("---", "---", "---", "---", "---", "---:"));
        for (DataAccess da : result.getDataAccesses()) {
            int line = da.getSourceLocation() != null ? da.getSourceLocation().getLine() : 0;
            md.append(MarkdownTableBuilder.row(
                    da.getProgramName(),
                    da.getOperation() == null ? "" : da.getOperation().name(),
                    da.getEntityOrViewName(),
                    da.getResolvedEntityName(),
                    da.getConditionExpression(),
                    String.valueOf(line)));
        }
        md.append("\n");

        md.append("## 7. Program Calls\n\n");
        md.append(MarkdownTableBuilder.row("Source Program", "Call Type", "Target", "Line"));
        md.append(MarkdownTableBuilder.row("---", "---", "---", "---:"));
        for (ProgramCall c : result.getProgramCalls()) {
            int line = c.getSourceLocation() != null ? c.getSourceLocation().getLine() : 0;
            md.append(MarkdownTableBuilder.row(
                    c.getSourceProgram(),
                    c.getCallType(),
                    c.getTargetProgram(),
                    String.valueOf(line)));
        }
        md.append("\n");

        md.append("## 8. Business Rule Candidates\n\n");
        md.append(MarkdownTableBuilder.row("Program", "Type", "Condition / Formula", "Action", "Evidence", "Line"));
        md.append(MarkdownTableBuilder.row("---", "---", "---", "---", "---", "---:"));
        for (BusinessRuleCandidate b : result.getBusinessRuleCandidates()) {
            int line = b.getSourceLocation() != null ? b.getSourceLocation().getLine() : 0;
            String condCol = b.getConditionExpression() == null ? "" : b.getConditionExpression();
            String actionCol = b.getActionExpression() == null ? "" : b.getActionExpression();
            if ("CALCULATION".equals(b.getRuleType())) {
                condCol = actionCol;
                actionCol = "";
            } else if (condCol.isEmpty()) {
                condCol = actionCol;
            }
            md.append(MarkdownTableBuilder.row(
                    b.getProgramName(),
                    b.getRuleType(),
                    condCol,
                    actionCol,
                    b.getRawCode(),
                    String.valueOf(line)));
        }
        md.append("\n");

        md.append("## 9. Parse Issues\n\n");
        md.append(MarkdownTableBuilder.row("File", "Line", "Column", "Severity", "Message"));
        md.append(MarkdownTableBuilder.row("---", "---:", "---:", "---", "---"));
        for (ParseIssue pi : result.getParseIssues()) {
            md.append(MarkdownTableBuilder.row(
                    pi.getArtifactPath(),
                    String.valueOf(pi.getLine()),
                    String.valueOf(pi.getColumn()),
                    pi.getSeverity(),
                    pi.getMessage()));
        }
        md.append("\n");

        md.append("## 10. Modernization Notes\n\n");
        appendModernizationNotes(md, accesses, entities, result.getPrograms().size(), rules, issues);
        md.append("\n");

        return md.toString();
    }

    private static void appendCrudMatrix(StringBuilder md, AnalysisResult result) {
        Map<String, Map<String, String>> matrix = result.getCrudMatrix();
        if (matrix.isEmpty()) {
            md.append("_No CRUD matrix rows._\n");
            return;
        }
        Set<String> entityCols = new LinkedHashSet<String>();
        for (Map<String, String> row : matrix.values()) {
            entityCols.addAll(row.keySet());
        }
        List<String> cols = new ArrayList<String>(entityCols);
        Collections.sort(cols, String.CASE_INSENSITIVE_ORDER);

        List<String> header = new ArrayList<String>();
        header.add("Program");
        header.addAll(cols);
        md.append(MarkdownTableBuilder.row(header.toArray(new String[header.size()])));
        List<String> sep = new ArrayList<String>();
        sep.add("---");
        for (int i = 0; i < cols.size(); i++) {
            sep.add("---:");
        }
        md.append(MarkdownTableBuilder.row(sep.toArray(new String[sep.size()])));

        List<String> progs = new ArrayList<String>(matrix.keySet());
        Collections.sort(progs, String.CASE_INSENSITIVE_ORDER);
        for (String prog : progs) {
            Map<String, String> row = matrix.get(prog);
            List<String> cells = new ArrayList<String>();
            cells.add(prog);
            for (String col : cols) {
                String v = row.get(col);
                cells.add(v == null ? "" : v);
            }
            md.append(MarkdownTableBuilder.row(cells.toArray(new String[cells.size()])));
        }
    }

    private static void appendModernizationNotes(StringBuilder md,
                                                 int accesses, int entities, int programs, int rules, int issues) {
        md.append("- Programs with many data accesses may require special attention during service decomposition.\n");
        md.append("- Entities updated by multiple programs may require transactional boundary analysis.\n");
        md.append("- Business rules extracted from IF, DECIDE and COMPUTE statements require functional validation.\n");
        md.append("- DDMs were used as the primary source for logical data model extraction.\n");
        md.append("- Parsing is partial and should be expanded based on real source code coverage.\n");
        if (accesses > 50) {
            md.append("- High volume of detected data accesses suggests complex data coupling.\n");
        }
        if (issues > 0) {
            md.append("- Parse issues were recorded; treat structural extraction as incomplete until grammar coverage improves.\n");
        }
        if (entities > 0 && programs > 0 && rules == 0) {
            md.append("- Few or no heuristic rules were detected; validation-heavy logic may be embedded in non-IF constructs.\n");
        }
    }

    private static int countArtifacts(AnalysisResult result, ArtifactType type) {
        int n = 0;
        for (SourceArtifact a : result.getArtifacts()) {
            if (a.getArtifactType() == type) {
                n++;
            }
        }
        return n;
    }

    private static int countFields(AnalysisResult result) {
        int n = 0;
        for (LegacyEntity e : result.getEntities()) {
            n += e.getFields().size();
        }
        return n;
    }

    private static String formatDate(long millis) {
        if (millis <= 0L) {
            millis = System.currentTimeMillis();
        }
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss 'UTC'", Locale.ROOT);
        sdf.setTimeZone(TimeZone.getTimeZone("UTC"));
        return sdf.format(new Date(millis));
    }
}
