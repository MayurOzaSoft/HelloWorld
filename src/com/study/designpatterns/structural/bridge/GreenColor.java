package com.study.designpatterns.structural.bridge;

public class GreenColor implements Color {
    @Override
    public void applyColor() {
        System.out.println("GREEN.");
    }
}
