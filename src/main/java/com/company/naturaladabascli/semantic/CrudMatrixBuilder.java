package com.company.naturaladabascli.semantic;

import com.company.naturaladabascli.model.AnalysisResult;
import com.company.naturaladabascli.model.CrudOperation;
import com.company.naturaladabascli.model.DataAccess;
import com.company.naturaladabascli.model.LegacyEntity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/**
 * Builds a program-by-entity CRUD letter matrix from {@link DataAccess} rows.
 */
public final class CrudMatrixBuilder {

    private CrudMatrixBuilder() {
    }

    public static void build(AnalysisResult result) {
        Map<String, Map<String, EnumSet<CrudOperation>>> acc = new LinkedHashMap<String, Map<String, EnumSet<CrudOperation>>>();
        Set<String> allEntities = new TreeSet<String>(String.CASE_INSENSITIVE_ORDER);

        for (LegacyEntity e : result.getEntities()) {
            if (e.getName() != null) {
                allEntities.add(e.getName().toUpperCase(Locale.ROOT));
            }
        }

        for (DataAccess da : result.getDataAccesses()) {
            String program = da.getProgramName();
            if (program == null || program.isEmpty()) {
                continue;
            }
            String entity = da.getResolvedEntityName();
            if (entity == null || entity.isEmpty()) {
                entity = da.getEntityOrViewName();
            }
            if (entity == null || entity.isEmpty()) {
                continue;
            }
            String entKey = entity.toUpperCase(Locale.ROOT);
            allEntities.add(entKey);
            if (!acc.containsKey(program)) {
                acc.put(program, new LinkedHashMap<String, EnumSet<CrudOperation>>());
            }
            Map<String, EnumSet<CrudOperation>> row = acc.get(program);
            if (!row.containsKey(entKey)) {
                row.put(entKey, EnumSet.noneOf(CrudOperation.class));
            }
            if (da.getOperation() != null) {
                row.get(entKey).add(da.getOperation());
            }
        }

        List<String> entityColumns = new ArrayList<String>(allEntities);
        Collections.sort(entityColumns);

        result.getCrudMatrix().clear();
        List<String> programs = new ArrayList<String>(acc.keySet());
        Collections.sort(programs, String.CASE_INSENSITIVE_ORDER);
        for (String prog : programs) {
            Map<String, EnumSet<CrudOperation>> row = acc.get(prog);
            Map<String, String> outRow = new LinkedHashMap<String, String>();
            for (String col : entityColumns) {
                EnumSet<CrudOperation> ops = row.get(col);
                outRow.put(col, formatOps(ops));
            }
            result.getCrudMatrix().put(prog, outRow);
        }
    }

    private static String formatOps(EnumSet<CrudOperation> ops) {
        if (ops == null || ops.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        if (ops.contains(CrudOperation.CREATE)) {
            sb.append('C');
        }
        if (ops.contains(CrudOperation.READ)) {
            sb.append('R');
        }
        if (ops.contains(CrudOperation.UPDATE)) {
            sb.append('U');
        }
        if (ops.contains(CrudOperation.DELETE)) {
            sb.append('D');
        }
        String compact = sb.toString();
        if (compact.length() <= 1) {
            return compact;
        }
        StringBuilder out = new StringBuilder();
        for (int i = 0; i < compact.length(); i++) {
            if (i > 0) {
                out.append('/');
            }
            out.append(compact.charAt(i));
        }
        return out.toString();
    }
}
