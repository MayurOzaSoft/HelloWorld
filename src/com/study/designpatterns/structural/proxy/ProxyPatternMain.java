package com.study.designpatterns.structural.proxy;

import java.io.IOException;

public class ProxyPatternMain {
    public static void main(String[] args) throws IOException {
        Executor executor = new ExecutorImplProxy("TEST", "TEST123");
        executor.runCommand("move digit, move unit, sum digit +  unit");
        executor.runCommand("rm digit, move unit, sum digit +  unit");
    }

    /**
     * Basically used to add layer which is restricting to perform actions with particular control
     * e.g. Java RMI follows this patterns
     */
}
