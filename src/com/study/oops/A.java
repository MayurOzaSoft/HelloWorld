package com.study.oops;

import com.study.oops.overriding.D;

import java.io.IOException;

public class A extends D {
    public int iA = 10;

    public A() throws IOException {
        System.out.println("Insider Constructor");
    }

    A(int i){
        this.iA = i;
    }

    @Override
    public void m1() {

    }

    /**
     * Override of Abstract method must be overridden
     */
}