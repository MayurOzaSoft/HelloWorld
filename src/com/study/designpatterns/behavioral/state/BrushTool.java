package com.study.designpatterns.behavioral.state;

public class BrushTool implements Tool {
    @Override
    public void mouseDown() {
        System.out.println("Brush Sign Marker");
    }

    @Override
    public void mouseUp() {
        System.out.println("Brush Marker Line");
    }
}
