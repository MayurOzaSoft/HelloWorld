package com.study.designpatterns.creational.builder;

public class InfrastructureBuilderMain {
    public static void main(String[] args) {
        Computer computerPC = new Computer.ComputerBuilder("8GB", "1TB", "2.4 GHz").setBluetoothEnabled(true).setGraphicEnabled(true).build();
        System.out.println("Infrastructure set up PC = "+computerPC);
    }

    /**
     * It is used to avoid problems of Factory and AbstractFactory Pattern
     * e.g. StringBuffer#append(), StringBuilder#append()
     *
     */
}
