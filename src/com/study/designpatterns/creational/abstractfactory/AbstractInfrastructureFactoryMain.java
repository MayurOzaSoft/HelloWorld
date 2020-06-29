package com.study.designpatterns.creational.abstractfactory;

import com.study.designpatterns.creational.factory.Computer;

public class AbstractInfrastructureFactoryMain {
    public static void main(String[] args) {
        Computer computerPC = InfrastructureFactory.getInfraStructureInstance(new PCFactory("8GB", "1TB", "2.4 Ghz"));
        Computer computerServer = InfrastructureFactory.getInfraStructureInstance(new ServerFactory("32GB", "10TB", "2.9 Ghz"));

        System.out.println("Infrastructure set up PC = "+ computerPC);
        System.out.println("Infrastructure set up Server = "+ computerServer);
    }
}
