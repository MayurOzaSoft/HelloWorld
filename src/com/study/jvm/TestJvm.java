package com.study.jvm;

import com.study.classes.Car;

public class TestJvm {

    Car carInstance = new Car();
    static Car carStatic = new Car();

    public static void main(String[] args) {
        TestJvm testJvm = new TestJvm();
        Car carThread = new Car();
    }

    // Memory Allocation in JVM
    /**
     * 1. All Objects will be stored in Heap Area
     * 2. all Static Objects are stored in Method area, so in tha analogy carStatic reference to Heap Memory from Method Area
     * 3. testJvm stored in Stack, testJvm reference to Heap Area Object of TestJvm -- ***Related to Thread
     * 4. as testJvm object is created, carInstance will be created inside TestJvm and referenced from Object to Heap Memory created object of Car
     * 4. carThread will be stored in Stack and References to Heap Area Object of Car -- ***Related to Thread
     */
}
