package com.study.designpatterns.structural.bridge;

public class Circle extends Shape {

    public Circle(Color color) {
        super(color);
    }

    @Override
    void applyColor() {
        System.out.print("Apply color for Circle is : ");
        color.applyColor();
    }
}
