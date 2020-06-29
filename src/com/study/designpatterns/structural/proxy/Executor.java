package com.study.designpatterns.structural.proxy;

import java.io.IOException;

public interface Executor {
    void runCommand(String command) throws IOException;
}
