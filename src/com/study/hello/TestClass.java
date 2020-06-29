package com.study.hello;

import com.study.oops.overloading.Test;

public class TestClass {
    int number = 8; // global variable

    // Frame main inside Stack (1)
    public static void main(String[] args) {
        int age; // local variable of Main Method
        age = 20;
        doWork();

        String name = "";
        // const testDemo;// = ""; // const correctness is not allowed in java
        Test test;
        test = new Test(); // Reference Variable (Actual object resides in Heap Area) -- Pointer reference like in C++
        test = new Test(); // Reference modified and Garbage collection looks for it in Heap Memory and old reference is removed by GC for memory release management

    }

    // Frame doWork inside Stack (2)
    private static void doWork(){
        int workingNumber;// Local variable of method
        doMore();
    }

    // Frame doMore inside Stack (3)
    private static void doMore(){

    }
}
