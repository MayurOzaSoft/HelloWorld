package com.study.designpatterns.structural.decorator;

public class DecoratorMain {
    public static void main(String[] args) {
        Car sportsCar = new SportsCar(new BasicCar());
        sportsCar.assemble();

        Car luxuryCar = new LuxuryCar(new BasicCar());
        luxuryCar.assemble();

        Car richCar = new SportsCar(new LuxuryCar(new BasicCar()));
        richCar.assemble();
    }
}
