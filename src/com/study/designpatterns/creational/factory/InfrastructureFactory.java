package com.study.designpatterns.creational.factory;

public class InfrastructureFactory {

    public static Computer getInfraStructureInstance(String type, String ram, String hdd, String cpu){
        if(type.equals("pc")) return new PC(ram, hdd, cpu);
        else if(type.equals("server")) return new Server(ram, hdd, cpu);
        return null;
    }

    /**
     * We can keep Factory as Singleton or make available one method with static for initialisation
     * Based on input we can decide which one to create
     * e.g. Calendar, NumberFormat and valueOf method in Wrapper classes like Boolean, Long, Integer etc.
     */
}
