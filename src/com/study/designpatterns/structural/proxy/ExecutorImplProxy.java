package com.study.designpatterns.structural.proxy;

import java.io.IOException;

public class ExecutorImplProxy implements Executor {
    private boolean isAdmin;
    private Executor executor;

    public ExecutorImplProxy(String user, String password) {
        if(user.equals("TEST") && password.equals("TEST"))
            isAdmin = true;
        executor = new ExecutorImpl();
    }

    @Override
    public void runCommand(String command) throws IOException {
        if(isAdmin)
            executor.runCommand(command);
        else {
            if(command.startsWith("rm"))
                throw new RuntimeException("INVALID COMMAND FOUND, NOT AUTHORISED TO PROCESS");
            else
                executor.runCommand(command);
        }
    }
}
