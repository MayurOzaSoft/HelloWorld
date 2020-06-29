package com.study.designpatterns.structural.adaptor;

public class SocketAdaptorImplComposition implements SocketAdaptor {
    private int unit;
    private Socket socket = new Socket();

    @Override
    public Volt get12Volt() {
        Volt volt = socket.getVolt();
        return convertVolts(volt, 10);
    }

    @Override
    public Volt get3Volt() {
        Volt volt = socket.getVolt();
        return convertVolts(volt, 40);
    }

    @Override
    public Volt get120Volt() {
        Volt volt = socket.getVolt();
        return volt;
    }

    private Volt convertVolts(Volt volt, int unit) {
        volt.setVolt(volt.getVolt()/unit);
        return volt;
    }
}
