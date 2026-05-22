package com.company.naturaladabascli.source;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Creates and cleans per-run workspace folders under {@code .natural-analyzer-workspace}.
 */
public class WorkspaceManager {

    private static final String ROOT_DIR = ".natural-analyzer-workspace";

    public Path createWorkspace(Path baseDir, String timestampFolder) throws Exception {
        Path root = baseDir.resolve(ROOT_DIR).resolve(timestampFolder);
        Files.createDirectories(root.resolve("source"));
        Files.createDirectories(root.resolve("extracted"));
        Files.createDirectories(root.resolve("report"));
        Files.createDirectories(root.resolve("logs"));
        return root;
    }

    public Path defaultBaseDir() {
        return Paths.get(System.getProperty("user.dir"));
    }
}
