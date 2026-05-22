package com.company.naturaladabascli.cli;

import java.util.Locale;

/**
 * Infers {@link SourceType} when the user passes {@link SourceType#AUTO}.
 */
public final class SourceTypeDetector {

    private SourceTypeDetector() {
    }

    public static SourceType detect(String source, SourceType explicit) {
        if (explicit != null && explicit != SourceType.AUTO) {
            return explicit;
        }
        if (source == null || source.trim().isEmpty()) {
            throw new IllegalArgumentException("--source is required");
        }
        String s = source.trim();
        String lower = s.toLowerCase(Locale.ROOT);
        if (s.startsWith("https://github.com/") && !lower.endsWith(".zip")) {
            return SourceType.GIT;
        }
        if ((s.startsWith("http://") || s.startsWith("https://")) && lower.endsWith(".zip")) {
            return SourceType.ZIP_URL;
        }
        if (lower.endsWith(".zip")) {
            return SourceType.ZIP_FILE;
        }
        throw new IllegalArgumentException(
                "Unable to infer --type. Provide --type git|zip-url|zip-file for source: " + source);
    }
}
