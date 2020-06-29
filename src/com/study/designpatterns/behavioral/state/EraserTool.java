package com.study.designpatterns.behavioral.state;

public class EraserTool implements Tool {
    @Override
    public void mouseDown() {
        System.out.println("Eraser Marker");
    }

    @Override
    public void mouseUp() {
        System.out.println("Clearing Line");
    }
}
