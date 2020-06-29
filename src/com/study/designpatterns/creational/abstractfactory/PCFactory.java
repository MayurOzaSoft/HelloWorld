package com.study.designpatterns.creational.abstractfactory;

import com.study.designpatterns.creational.factory.Computer;
import com.study.designpatterns.creational.factory.PC;

public class PCFactory implements ComputerAbstractFactory {

    private String ram;
    private String memory;
    private String frequency;

    public PCFactory(String ram, String memory, String frequency) {
        this.ram = ram;
        this.memory = memory;
        this.frequency = frequency;
    }

    @Override
    public Computer createInfrastructure() {
        return new PC(ram, memory, frequency);
    }
}

