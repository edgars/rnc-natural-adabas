package com.company.naturaladabascli.source;

import com.company.naturaladabascli.cli.SourceType;
import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;
import org.apache.commons.compress.archivers.zip.ZipFile;

import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Extract a local ZIP archive into the workspace.
 */
public class ZipFileSourceResolver implements SourceResolver {

    @Override
    public Path resolve(String source, Path workspace) throws Exception {
        Path zipPath = Paths.get(source).toAbsolutePath().normalize();
        if (!Files.isRegularFile(zipPath)) {
            throw new IllegalArgumentException("ZIP file not found: " + zipPath);
        }
        Path sourceDir = workspace.resolve("source");
        Files.createDirectories(sourceDir);
        Files.copy(zipPath, sourceDir.resolve(zipPath.getFileName()), java.nio.file.StandardCopyOption.REPLACE_EXISTING);
        Path extracted = workspace.resolve("extracted");
        Files.createDirectories(extracted);
        extractZip(zipPath, extracted);
        return extracted;
    }

    private static void extractZip(Path zipFile, Path destDir) throws Exception {
        try (ZipFile zf = new ZipFile(zipFile.toFile())) {
            java.util.Enumeration<ZipArchiveEntry> entries = zf.getEntries();
            while (entries.hasMoreElements()) {
                ZipArchiveEntry entry = entries.nextElement();
                Path out = destDir.resolve(entry.getName()).normalize();
                if (!out.startsWith(destDir.normalize())) {
                    continue;
                }
                if (entry.isDirectory()) {
                    Files.createDirectories(out);
                } else {
                    if (out.getParent() != null) {
                        Files.createDirectories(out.getParent());
                    }
                    try (InputStream is = zf.getInputStream(entry);
                         OutputStream os = Files.newOutputStream(out)) {
                        org.apache.commons.io.IOUtils.copy(is, os);
                    }
                }
            }
        }
    }

    @Override
    public boolean supports(String source, SourceType type) {
        if (type == SourceType.ZIP_FILE) {
            return true;
        }
        if (type == SourceType.AUTO && source != null) {
            String s = source.toLowerCase();
            boolean remote = source.startsWith("http://") || source.startsWith("https://");
            return !remote && s.endsWith(".zip");
        }
        return false;
    }
}
