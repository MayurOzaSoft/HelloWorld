package com.study.oops.methodhiding;

public class TestParent {

    static int i = 100;

    public static void testParent(){
        System.out.println("Inside TestParent Static Method");
    }

    public void testVarArgs(int... i){
        System.out.println("Inside TestParent testVarArgs Method");
    }
}
