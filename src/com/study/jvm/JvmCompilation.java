package com.study.jvm;

public class JvmCompilation {

    int i = 5;
    public int simpleField = 100; // flagged as ACC_PUBLIC
    public native int simpleFieldNative(int number); // flagged as ACC_PUBLIC
    public final int simpleFieldFinal = 100; // flagged as ACC_FINAL

    public void demo(){
        System.out.println("Inside Demo Method");
    }
}
