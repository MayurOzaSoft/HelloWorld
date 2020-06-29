package com.study.designpatterns.structural.bridge;

public class BridgeMain {
    public static void main(String[] args) {
        Shape circleShape = new Circle(new RedColor());
        circleShape.applyColor();

        Shape triangleShape = new Triangle(new GreenColor());
        triangleShape.applyColor();
    }
}
