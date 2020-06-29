package com.study.designpatterns.structural.adaptor;

public class SocketAdaptorImplInheritance extends Socket implements SocketAdaptor {

    private int unit;

    @Override
    public Volt get12Volt() {
        Volt volt = getVolt();
        return convertVolts(volt, 10);
    }

    @Override
    public Volt get3Volt() {
        Volt volt = getVolt();
        return convertVolts(volt, 40);
    }

    @Override
    public Volt get120Volt() {
        Volt volt = getVolt();
        return volt;
    }

    private Volt convertVolts(Volt volt, int unit) {
        volt.setVolt(volt.getVolt()/unit);
        return volt;
    }
}
