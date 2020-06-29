package com.study.oops.overriding;

import com.study.oops.A;

import java.io.EOFException;
import java.io.IOException;

public class C extends B {
    private int iC = 10;

    public C() throws IOException {
    }

    public static void methodStatic(B b) throws EOFException {
        System.out.println("Static methodStatic Executed with Exception");
    }

    // If any Abstract method, your class should be abstract
    // it is possible to override method from parent if implementation not known define it as abstract
    // public abstract void m1();

    // Overriding Method Method
    public void methodA(A a){
        System.out.println("A Executed");
    }

    public void methodA(B b) throws IOException {
        System.out.println("B Executed");
    }

    // After 1.5 is allowed it is child of Object (considered as Co-variant Type)
    protected synchronized String methodTest(){
        return null;
    }

    // It is valid but it is not considered as overriding
    public final void methodTestPrivate(){
        System.out.println("Child Method exactly same as Private method in Parent");
    }

    /**
     * 1. Following modifiers won't keep any restriction
     * 			- synchronized
     * 			- native
     * 			- strictfp
     * 			- abstract
     * 2. Final to non final overriding not possible but non final to final is possible in overridden methods
     *
     */
}
