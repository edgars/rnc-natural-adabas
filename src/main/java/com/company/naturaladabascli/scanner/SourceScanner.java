package com.company.naturaladabascli.scanner;

import com.company.naturaladabascli.model.ArtifactType;
import com.company.naturaladabascli.model.ParseStatus;
import com.company.naturaladabascli.model.SourceArtifact;
import com.company.naturaladabascli.util.ChecksumUtils;
import com.company.naturaladabascli.util.FileUtils;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.UUID;

/**
 * Recursive filesystem scan with directory and extension exclusions.
 */
public class SourceScanner {

    private static final Set<String> IGNORE_DIR = new HashSet<String>(Arrays.asList(
            ".git", "node_modules", "target", "build", "dist"));

    private final BinaryFileDetector binaryFileDetector = new BinaryFileDetector();
    private final ArtifactClassifier classifier = new ArtifactClassifier();
    private final EncodingNormalizer encodingNormalizer = new EncodingNormalizer();

    public List<SourceArtifact> scan(Path root) throws IOException {
        final List<SourceArtifact> out = new ArrayList<SourceArtifact>();
        if (root == null || !Files.exists(root)) {
            return out;
        }
        Files.walkFileTree(root, new SimpleFileVisitor<Path>() {
            @Override
            public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) {
                String name = dir.getFileName() == null ? "" : dir.getFileName().toString();
                if (IGNORE_DIR.contains(name.toLowerCase(Locale.ROOT))) {
                    return FileVisitResult.SKIP_SUBTREE;
                }
                return FileVisitResult.CONTINUE;
            }

            @Override
            public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
                if (!attrs.isRegularFile()) {
                    return FileVisitResult.CONTINUE;
                }
                String fn = file.getFileName().toString();
                if (binaryFileDetector.shouldIgnoreByExtension(fn)) {
                    return FileVisitResult.CONTINUE;
                }
                byte[] bytes = FileUtils.readAllBytes(file);
                EncodingNormalizer.NormalizedText nt = encodingNormalizer.normalize(bytes);
                String rel = root.relativize(file).toString().replace('\\', '/');
                ArtifactType type = classifier.classify(rel, nt.getText());
                if (type == ArtifactType.UNKNOWN) {
                    SourceArtifact a = artifact(rel, fn, ArtifactType.UNKNOWN, nt, bytes.length, bytes);
                    out.add(a);
                    return FileVisitResult.CONTINUE;
                }
                SourceArtifact a = artifact(rel, fn, type, nt, bytes.length, bytes);
                out.add(a);
                return FileVisitResult.CONTINUE;
            }
        });
        return out;
    }

    private SourceArtifact artifact(String rel, String fileName, ArtifactType type,
                                    EncodingNormalizer.NormalizedText nt, long size, byte[] raw) {
        SourceArtifact a = new SourceArtifact();
        a.setId(UUID.randomUUID().toString());
        a.setRelativePath(rel);
        a.setFileName(fileName);
        a.setArtifactType(type);
        a.setEncoding(nt.getEncoding());
        a.setSize(size);
        a.setChecksum(ChecksumUtils.md5Hex(raw));
        a.setContent(nt.getText());
        a.setParseStatus(ParseStatus.OK);
        return a;
    }
}
