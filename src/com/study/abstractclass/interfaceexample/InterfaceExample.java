package com.study.abstractclass.interfaceexample;

public interface InterfaceExample {
    int iInterface = 0;

    void exampleDemo();

    default void demo(){
        System.out.println("Inside Default Method of demo");
    };

    default void demoDefault(int i){
        System.out.println("Inside Default Method of demoDefault : "+ i);
    };

    static void staticDemo(){
        System.out.println("Inside Default Method of staticDemo : " + iInterface);
    };
}
