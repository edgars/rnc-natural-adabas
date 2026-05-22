package com.company.naturaladabascli.scanner;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/**
 * Try UTF-8 first; fall back to ISO-8859-1 when replacement characters suggest mojibake.
 */
public class EncodingNormalizer {

    public static final class NormalizedText {
        private final String text;
        private final String encoding;

        public NormalizedText(String text, String encoding) {
            this.text = text;
            this.encoding = encoding;
        }

        public String getText() {
            return text;
        }

        public String getEncoding() {
            return encoding;
        }
    }

    public NormalizedText normalize(byte[] bytes) {
        if (bytes == null) {
            return new NormalizedText("", StandardCharsets.UTF_8.name());
        }
        String utf8 = new String(bytes, StandardCharsets.UTF_8);
        int replacementCount = countChar(utf8, '\uFFFD');
        if (replacementCount > 0) {
            String iso = new String(bytes, Charset.forName("ISO-8859-1"));
            return new NormalizedText(iso, "ISO-8859-1");
        }
        return new NormalizedText(utf8, StandardCharsets.UTF_8.name());
    }

    private static int countChar(String s, char c) {
        int n = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                n++;
            }
        }
        return n;
    }
}
