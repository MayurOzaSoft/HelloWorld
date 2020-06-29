package com.study.designpatterns.structural.bridge;

public abstract class Shape {
    // Composition
    protected Color color;

    public Shape(Color color) {
        this.color = color;
    }

    abstract void applyColor();
}
