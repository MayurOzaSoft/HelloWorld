package com.study.oops.instanceblock;

public class InstanceBlockFlow {
    int i = 10;

    {
        test();
        System.out.println("Inside First Instance Block");
    }

    public InstanceBlockFlow() {
        System.out.println("Instance Class constructor");
    }

    private void test() {
        System.out.println(j);
    }

    public static void main(String[] args) {
        InstanceBlockFlow instanceBlockFlow = new InstanceBlockFlow();
        System.out.println("Inside Main Block");
    }

    {
        System.out.println("Inside Second Instance Block");
    }

    int j = 20;
}
