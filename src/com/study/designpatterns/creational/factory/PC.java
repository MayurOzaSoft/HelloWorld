package com.study.designpatterns.creational.factory;

public class PC extends Computer {

    private String ram;
    private String memory;
    private String frequency;

    public PC(String ram, String memory, String frequency) {
        this.ram = ram;
        this.memory = memory;
        this.frequency = frequency;
    }

    @Override
    String getRAM() {
        return this.ram;
    }

    @Override
    String getHDD() {
        return this.memory;
    }

    @Override
    String getCPU() {
        return this.frequency;
    }
}
