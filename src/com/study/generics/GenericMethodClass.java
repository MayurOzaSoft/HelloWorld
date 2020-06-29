package com.study.generics;

import java.util.ArrayList;

public class GenericMethodClass {
    public static void main(String[] args) {
        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("JAVA");
        stringArrayList.add("B");
        // stringArrayList.add(12); // Compile time Error
        testGenericMethod(stringArrayList);

        //stringArrayList.add(10.5); // compile time Error

        System.out.println(stringArrayList);

        /**
         * This basically was incorporated in order to support old version of Java before 1.4
         */

    }

    private static void testGenericMethod(ArrayList arrayList) {
        arrayList.add("TEST INSIDE NON-GENERIC");
        arrayList.add(234.89540);
        arrayList.add(10);
        arrayList.add(20.5);
    }
}
