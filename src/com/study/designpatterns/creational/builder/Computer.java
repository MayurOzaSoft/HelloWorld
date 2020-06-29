package com.study.designpatterns.creational.builder;

public class Computer {
    // Mandatory
    private String ram;
    private String memory;
    private String frequency;

    // Optional
    private boolean isGraphicEnabled;
    private boolean isBluetoothEnabled;

    private Computer(ComputerBuilder computerBuilder) {
        this.ram = computerBuilder.ram;
        this.memory = computerBuilder.memory;
        this.frequency = computerBuilder.frequency;
        this.isGraphicEnabled = computerBuilder.isGraphicEnabled;
        this.isBluetoothEnabled = computerBuilder.isBluetoothEnabled;
    }

    public String getRam() {
        return ram;
    }

    public String getMemory() {
        return memory;
    }

    public String getFrequency() {
        return frequency;
    }

    public boolean isGraphicEnabled() {
        return isGraphicEnabled;
    }

    public boolean isBluetoothEnabled() {
        return isBluetoothEnabled;
    }

    public static class ComputerBuilder {

        // Mandatory
        private String ram;
        private String memory;
        private String frequency;

        // Optional
        private boolean isGraphicEnabled;
        private boolean isBluetoothEnabled;

        public ComputerBuilder(String ram, String memory, String frequency) {
            this.ram = ram;
            this.memory = memory;
            this.frequency = frequency;
        }

        public ComputerBuilder setRam(String ram) {
            this.ram = ram;
            return this;
        }

        public ComputerBuilder setMemory(String memory) {
            this.memory = memory;
            return this;
        }

        public ComputerBuilder setFrequency(String frequency) {
            this.frequency = frequency;
            return this;
        }

        public ComputerBuilder setGraphicEnabled(boolean graphicEnabled) {
            isGraphicEnabled = graphicEnabled;
            return this;
        }

        public ComputerBuilder setBluetoothEnabled(boolean bluetoothEnabled) {
            isBluetoothEnabled = bluetoothEnabled;
            return this;
        }

        public Computer build(){
            return new Computer(this);
        }
    }

    @Override
    public String toString() {
        return "Computer{" +
                "ram='" + ram + '\'' +
                ", memory='" + memory + '\'' +
                ", frequency='" + frequency + '\'' +
                ", isGraphicEnabled=" + isGraphicEnabled +
                ", isBluetoothEnabled=" + isBluetoothEnabled +
                '}';
    }
}
