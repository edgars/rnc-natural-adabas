package com.company.naturaladabascli.source;

import com.company.naturaladabascli.cli.SourceType;

import java.nio.file.Path;

/**
 * Resolves a logical source (URL or path) into a directory tree under the workspace.
 */
public interface SourceResolver {

    Path resolve(String source, Path workspace) throws Exception;

    boolean supports(String source, SourceType type);
}
