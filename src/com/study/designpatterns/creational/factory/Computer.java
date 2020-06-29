package com.study.designpatterns.creational.factory;

public abstract class Computer {
    abstract String getRAM();
    abstract String getHDD();
    abstract String getCPU();

    @Override
    public String toString() {
        return "Computer{RAM="+this.getRAM()+" HDD="+this.getHDD()+" CPU="+this.getCPU()+"}";
    }
}
