package com.study.designpatterns.structural.adaptor;

public class Volt {
    private int volt;

    public Volt(int volt) {
        this.volt = volt;
    }

    public int getVolt() {
        return volt;
    }

    public Volt setVolt(int volt) {
        this.volt = volt;
        return this;
    }

    @Override
    public String toString() {
        return "Volt{" +
                "volt=" + volt +
                '}';
    }
}
