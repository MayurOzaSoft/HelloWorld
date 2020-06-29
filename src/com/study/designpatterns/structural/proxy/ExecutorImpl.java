package com.study.designpatterns.structural.proxy;

import java.io.IOException;

public class ExecutorImpl implements Executor {
    @Override
    public void runCommand(String command) throws IOException {
        System.out.println("Executing runCommand @"+ this.getClass().getName());
    }
}
