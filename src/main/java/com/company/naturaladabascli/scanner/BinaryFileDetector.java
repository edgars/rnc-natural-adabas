package com.company.naturaladabascli.scanner;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/**
 * Skip obvious non-text artifacts by extension.
 */
public class BinaryFileDetector {

    private static final Set<String> IGNORE_EXT = new HashSet<String>(Arrays.asList(
            ".class", ".jar", ".war", ".ear", ".exe", ".dll", ".so",
            ".png", ".jpg", ".jpeg", ".gif", ".pdf", ".doc", ".docx", ".xls", ".xlsx",
            ".zip", ".tar", ".gz"));

    public boolean shouldIgnoreByExtension(String fileName) {
        if (fileName == null) {
            return true;
        }
        String lower = fileName.toLowerCase(Locale.ROOT);
        for (String ext : IGNORE_EXT) {
            if (lower.endsWith(ext)) {
                return true;
            }
        }
        return false;
    }
}
