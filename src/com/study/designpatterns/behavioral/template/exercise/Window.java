package com.study.designpatterns.behavioral.template.exercise;

public abstract class Window {

    public void close() {
        //TODO: custom windows may need to execute some code before the window
        // is closed.
        before();

        System.out.println("Removing the window from the screen");

        //TODO: custom windows may need to execute some code after the window
        // is closed.
        after();
    }

    protected abstract void after();
    protected abstract void before();
}
