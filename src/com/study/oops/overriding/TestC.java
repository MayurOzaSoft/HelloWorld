package com.study.oops.overriding;

import java.io.EOFException;
import java.io.IOException;

public class TestC extends C {

    public TestC() throws IOException {
    }

    // if you make static, there will be compilation error : can not override instance method
    public void methodA(B b) throws EOFException {
        System.out.println("methodA Executed with Exception");
    }

    // Both are static from parent but it is called as "Method hiding"
    public static void methodStatic(B b) throws EOFException {
        System.out.println("Static methodStatic Executed with Exception");
    }

    //public void methodStatic(B b){

    //}

    /**
     * 1. if we try to add Interrupted Exception it will give an error saying, Overridden method does not throw java.lang.InterruptedException
     * 2. You can not override static method as non-static , else we will get compile time error
     * 3. you can not override non static method as static
     * 4. Both are static from parent and child is allowed, but this phenomenon is called as "Method hiding"
     */
}
