package com.study.oops.methodhiding;

public class TestChild extends TestParent {

    int i = 200;

    public static void testParent(){
        System.out.println("Inside TestChild Static Method");
    }

    public void testVarArgs(int i){
        System.out.println("Inside TestChild testVarArgs Method with normal argument");
    }

    public void testVarArgs(int... i){
        System.out.println("Inside TestChild testVarArgs Method with varargs argument");
    }
}
