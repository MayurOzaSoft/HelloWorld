package com.study.designpatterns.structural.decorator;

public class BasicCar implements Car {
    @Override
    public void assemble() {
        System.out.println("BASIC CAR");
    }
}
