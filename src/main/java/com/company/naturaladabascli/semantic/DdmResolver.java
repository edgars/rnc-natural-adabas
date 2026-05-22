package com.company.naturaladabascli.semantic;

import com.company.naturaladabascli.model.LegacyEntity;
import com.company.naturaladabascli.model.LegacyProgram;
import com.company.naturaladabascli.model.ProgramView;

import java.util.Locale;

/**
 * Resolves Natural view names to logical entities using DEFINE DATA and DDM inventory.
 */
public final class DdmResolver {

    private DdmResolver() {
    }

    public static String resolveViewToEntity(String viewOrName, LegacyProgram program) {
        if (viewOrName == null) {
            return "";
        }
        String key = viewOrName.toUpperCase(Locale.ROOT);
        for (ProgramView v : program.getViews()) {
            if (v.getViewName() != null && v.getViewName().toUpperCase(Locale.ROOT).equals(key)) {
                return v.getEntityName();
            }
        }
        return viewOrName;
    }

    public static boolean entityExists(String name, java.util.List<LegacyEntity> entities) {
        if (name == null) {
            return false;
        }
        String key = name.toUpperCase(Locale.ROOT);
        for (LegacyEntity e : entities) {
            if (e.getName() != null && e.getName().toUpperCase(Locale.ROOT).equals(key)) {
                return true;
            }
        }
        return false;
    }
}
