package com.company.naturaladabascli;

import com.company.naturaladabascli.cli.AnalyzeCommand;
import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Model.CommandSpec;
import picocli.CommandLine.Spec;

import java.util.concurrent.Callable;

/**
 * CLI entry point for the Natural/Adabas analyzer.
 */
@Command(
        name = "natural-adabas-cli-analyzer",
        mixinStandardHelpOptions = true,
        version = "natural-adabas-cli-analyzer 1.0.0",
        description = "Terminal-based static analyzer for Natural/Adabas legacy sources.",
        subcommands = {AnalyzeCommand.class})
public class Main implements Callable<Integer> {

    @Spec
    CommandSpec spec;

    public static void main(String[] args) {
        int exit = new CommandLine(new Main()).execute(args);
        System.exit(exit);
    }

    @Override
    public Integer call() {
        CommandLine cmd = spec.commandLine();
        cmd.usage(System.out);
        return 0;
    }
}
