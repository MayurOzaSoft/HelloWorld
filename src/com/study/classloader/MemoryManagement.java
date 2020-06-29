package com.study.classloader;

public class MemoryManagement {

    public static void main(String[] args) {

        double mb = 1024*1024; // Byte to MB Conversion
        Runtime runtime = Runtime.getRuntime();
        System.out.println("Free Memory : " + runtime.freeMemory()/mb); // No. of Bytes of Present in HEAP MEMORY
        System.out.println("Max Memory : " + runtime.maxMemory()/mb);  //
        System.out.println("Total Memory : " + runtime.totalMemory()/mb); // Total Memory allocated to HEAP MEMORY - INITIAL MEMORY
        System.out.println("Consumed Memory : " + ((runtime.totalMemory()/mb) - (runtime.freeMemory()/mb))); // Total Memory allocated to HEAP MEMORY - INITIAL MEMORY
        System.out.println(Runtime.version());

        /**
         * 1. Increase Heap Memory : java -xmx512m
         * 2. Min Heap Memory : java -xms64m
         * 3. java -xmx512m -xms64m <ClassName>
         * 4. Heap memory is finite Memory, Like above we can increase or decrease based on our requirement
         */
    }
}
