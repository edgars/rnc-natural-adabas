package com.company.naturaladabascli.drivers.natural;

import com.company.naturaladabascli.model.CrudOperation;

/**
 * Maps Natural data verbs to simplified CRUD operations.
 */
public final class NaturalCrudExtractor {

    private NaturalCrudExtractor() {
    }

    public static CrudOperation forFindReadGetHistogram(String verbUpper) {
        if ("FIND".equals(verbUpper) || "READ".equals(verbUpper) || "GET".equals(verbUpper)
                || "HISTOGRAM".equals(verbUpper)) {
            return CrudOperation.READ;
        }
        return CrudOperation.READ;
    }

    public static CrudOperation forStore() {
        return CrudOperation.CREATE;
    }

    public static CrudOperation forUpdate() {
        return CrudOperation.UPDATE;
    }

    public static CrudOperation forDelete() {
        return CrudOperation.DELETE;
    }
}
