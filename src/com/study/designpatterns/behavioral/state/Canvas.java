package com.study.designpatterns.behavioral.state;

public class Canvas {

    private Tool currentTool;

    public Tool getCurrentTool() {
        return currentTool;
    }

    public Canvas setCurrentTool(Tool currentTool) {
        this.currentTool = currentTool;
        return this;
    }

    public void mouseUp() {
        currentTool.mouseUp();
    }

    public void mouseDown() {
        currentTool.mouseDown();
    }
}
