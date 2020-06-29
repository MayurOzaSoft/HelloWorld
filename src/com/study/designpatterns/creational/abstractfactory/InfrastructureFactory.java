package com.study.designpatterns.creational.abstractfactory;

import com.study.designpatterns.creational.factory.Computer;

public class InfrastructureFactory {
    public static Computer getInfraStructureInstance(ComputerAbstractFactory abstractFactory){
        return abstractFactory.createInfrastructure();
    }

    /**
     * It focuses on creation of Interfaces rather implementation
     * It is Factory of Factories
     * It make ease of addition of another product in existing structure without effecting other classes
     * e.g.
     *    DocumentBuilder#newInstance() of javax
     *    XPathFactory#newInstance() of javax
     */
}
