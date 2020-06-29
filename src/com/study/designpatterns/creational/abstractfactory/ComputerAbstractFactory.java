package com.study.designpatterns.creational.abstractfactory;

import com.study.designpatterns.creational.factory.Computer;

public interface ComputerAbstractFactory {
    public Computer createInfrastructure();
}
