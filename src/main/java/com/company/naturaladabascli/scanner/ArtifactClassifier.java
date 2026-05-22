package com.company.naturaladabascli.scanner;

import com.company.naturaladabascli.model.ArtifactType;

import java.util.Locale;
import java.util.regex.Pattern;

/**
 * Heuristic classification of Natural-related sources.
 */
public class ArtifactClassifier {

    private static final Pattern NATURAL_KEYWORDS = Pattern.compile(
            "(?is).*(\\bDEFINE\\s+DATA\\b|\\bFIND\\b|\\bREAD\\b|\\bCALLNAT\\b|\\bPERFORM\\b).*");

    private static final Pattern DDM_KEYWORDS = Pattern.compile(
            "(?is).*(\\bDDM\\b|\\bFIELD\\b|\\bDBID\\b|\\bFNR\\b).*");

    public ArtifactType classify(String relativePath, String content) {
        if (relativePath == null) {
            return ArtifactType.UNKNOWN;
        }
        String name = relativePath.replace('\\', '/');
        String lower = name.toLowerCase(Locale.ROOT);
        String body = content == null ? "" : content;

        if (lower.endsWith(".ddm")) {
            return ArtifactType.NATURAL_DDM;
        }
        if (lower.endsWith(".nsn") || lower.endsWith(".nsp") || lower.endsWith(".nat")) {
            return ArtifactType.NATURAL_PROGRAM;
        }
        if (lower.endsWith(".nsc") || lower.endsWith(".cpy")) {
            return ArtifactType.NATURAL_COPYCODE;
        }
        if (lower.endsWith(".sql")) {
            return ArtifactType.SQL;
        }

        if (DDM_KEYWORDS.matcher(body).matches() && body.toUpperCase(Locale.ROOT).contains("FIELD")) {
            return ArtifactType.NATURAL_DDM;
        }
        if (NATURAL_KEYWORDS.matcher(body).matches()) {
            boolean hasDefineData = body.toUpperCase(Locale.ROOT).contains("DEFINE DATA");
            boolean looksFullProgram = hasDefineData && body.toUpperCase(Locale.ROOT).contains("END");
            if (looksFullProgram) {
                return ArtifactType.NATURAL_PROGRAM;
            }
            return ArtifactType.NATURAL_COPYCODE;
        }

        return ArtifactType.UNKNOWN;
    }
}
