package com.study.designpatterns.creational.factory;

public class InfrastructureFactoryMain {
    public static void main(String[] args) {
        Computer computerPC = InfrastructureFactory.getInfraStructureInstance("pc", "8GB", "1TB", "2.4 GHz");
        Computer computerServer = InfrastructureFactory.getInfraStructureInstance("server", "32GB", "10TB", "2.9 GHz");

        System.out.println("Infrastructure set up with PC = "+ computerPC);
        System.out.println("Infrastructure set up with Server = "+ computerServer);

        /**
         *
         */
    }
}
