package com.study.classes;

public class Car {
    private int doors;
    private int wheels;
    private String model;
    private String engine;

    public Car(int doors, int wheels, String model, String engine) {
        this.doors = doors;
        this.wheels = wheels;
        this.model = model;
        this.engine = engine;

        System.out.println("Class Hash Code "+ Car.class.hashCode());
    }

    public Car() {
        System.out.println("Class Hash Code "+ this.hashCode());
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
