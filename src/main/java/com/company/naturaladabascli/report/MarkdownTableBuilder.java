package com.company.naturaladabascli.report;

/**
 * Escapes and joins Markdown pipe tables.
 */
public final class MarkdownTableBuilder {

    private MarkdownTableBuilder() {
    }

    public static String escapeCell(String value) {
        if (value == null) {
            return "";
        }
        return value.replace("|", "\\|").replace("\n", " ").replace("\r", "");
    }

    public static String row(String... cells) {
        StringBuilder sb = new StringBuilder();
        sb.append("|");
        for (int i = 0; i < cells.length; i++) {
            sb.append(' ').append(escapeCell(cells[i])).append(" |");
        }
        sb.append("\n");
        return sb.toString();
    }
}
