package com.company.naturaladabascli.util;

import java.io.PrintStream;

/**
 * Simple console output for progress and banners.
 */
public final class ConsoleLogger {

    private final PrintStream out;

    public ConsoleLogger() {
        this(System.out);
    }

    public ConsoleLogger(PrintStream out) {
        this.out = out;
    }

    public void banner(String line) {
        out.println(line);
    }

    public void info(String message) {
        out.println(message);
    }

    public void step(int current, int total, String message) {
        out.println("[" + current + "/" + total + "] " + message);
    }
}
