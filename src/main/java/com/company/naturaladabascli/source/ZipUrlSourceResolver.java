package com.company.naturaladabascli.source;

import com.company.naturaladabascli.cli.SourceType;
import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;
import org.apache.commons.compress.archivers.zip.ZipFile;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

/**
 * Download a remote ZIP and extract it under the workspace.
 */
public class ZipUrlSourceResolver implements SourceResolver {

    @Override
    public Path resolve(String source, Path workspace) throws Exception {
        Path sourceDir = workspace.resolve("source");
        Files.createDirectories(sourceDir);
        Path zipPath = sourceDir.resolve("download.zip");
        URL url = new URL(source);
        try (InputStream in = url.openStream()) {
            Files.copy(in, zipPath, StandardCopyOption.REPLACE_EXISTING);
        }
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
        if (type == SourceType.ZIP_URL) {
            return true;
        }
        if (type == SourceType.AUTO && source != null) {
            String s = source.toLowerCase();
            return (source.startsWith("http://") || source.startsWith("https://")) && s.endsWith(".zip");
        }
        return false;
    }
}
