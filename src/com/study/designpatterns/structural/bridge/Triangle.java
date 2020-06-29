package com.study.designpatterns.structural.bridge;

public class Triangle extends Shape {

    public Triangle(Color color) {
        super(color);
    }

    @Override
    void applyColor() {
        System.out.print("Apply color for Triangle is : ");
        color.applyColor();
    }
}
