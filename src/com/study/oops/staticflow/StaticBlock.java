package com.study.oops.staticflow;

public class StaticBlock {

    static int i = test();

    {
        System.out.println("Inside Static instance block");
    }

    private static int test() {
        System.out.println("Insider Static Method test.prn");
        System.exit(0);
        return 10;
    }

    static {
        StaticBlock staticBlock = new StaticBlock();
        System.out.println("Inside Static Block");

    }
}
