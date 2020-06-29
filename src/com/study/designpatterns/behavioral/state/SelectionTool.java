package com.study.designpatterns.behavioral.state;

public class SelectionTool implements Tool {

    @Override
    public void mouseDown() {
        System.out.println("SHAPE OF SELECTION TOOL");
    }

    @Override
    public void mouseUp() {
        System.out.println("RECTANGLE MARKER");
    }
}
