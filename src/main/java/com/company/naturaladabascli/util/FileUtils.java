package com.company.naturaladabascli.util;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * Small helpers around java.nio.file.
 */
public final class FileUtils {

    private FileUtils() {
    }

    public static byte[] readAllBytes(Path path) throws IOException {
        return Files.readAllBytes(path);
    }

    public static void writeString(Path path, String content, Charset charset) throws IOException {
        if (path.getParent() != null) {
            Files.createDirectories(path.getParent());
        }
        Files.write(path, content.getBytes(charset));
    }

    public static void deleteDirectoryQuietly(Path root) {
        if (root == null || !Files.exists(root)) {
            return;
        }
        try {
            org.apache.commons.io.FileUtils.deleteDirectory(root.toFile());
        } catch (IOException ignored) {
            // best effort
        }
    }

    public static String readStringUtf8(Path path) throws IOException {
        return new String(readAllBytes(path), StandardCharsets.UTF_8);
    }
}
