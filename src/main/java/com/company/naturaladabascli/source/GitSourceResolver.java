package com.company.naturaladabascli.source;

import com.company.naturaladabascli.cli.SourceType;
import org.eclipse.jgit.api.Git;

import java.nio.file.Files;
import java.nio.file.Path;

/**
 * Clone public Git repositories with JGit (no authentication).
 */
public class GitSourceResolver implements SourceResolver {

    @Override
    public Path resolve(String source, Path workspace) throws Exception {
        Path dest = workspace.resolve("source").resolve("repo");
        Files.createDirectories(dest);
        Git git = Git.cloneRepository()
                .setURI(source)
                .setDirectory(dest.toFile())
                .setDepth(1)
                .call();
        try {
            return dest;
        } finally {
            git.close();
        }
    }

    @Override
    public boolean supports(String source, SourceType type) {
        if (type == SourceType.GIT) {
            return true;
        }
        if (type == SourceType.AUTO) {
            return source != null && source.startsWith("https://github.com/") && !source.toLowerCase().endsWith(".zip");
        }
        return false;
    }
}
