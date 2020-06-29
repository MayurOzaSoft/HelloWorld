package com.study.primitives;

public class FloatDouble {

    public static void main (String[] args0){

        // float
        float myMinimumFloat = Float.MIN_VALUE;
        float myMaximumFloat = Float.MAX_VALUE;

        System.out.println("myMinimumFloat Value : " + myMinimumFloat);
        System.out.println("myMaximumFloat Value : " + myMaximumFloat);

        // double
        double myMinimumDouble = Double.MIN_VALUE;
        double myMaximumDouble = Double.MAX_VALUE;

        System.out.println("myMinimumDouble Value : " + myMinimumDouble);
        System.out.println("myMaximumDouble Value : " + myMaximumDouble);

        // Casting
        int myInt = 5 / 3;
        float myFloat = 5f / 3f; // (float) not preferred way to do so, using f will be good practice
        double myDouble = 5d / 3d;

        System.out.println("myInt Value : " + myInt);
        System.out.println("myFloat Value : " + myFloat);
        System.out.println("myDouble Value : " + myDouble);

        // **** Use of Double preferred in all math function and highly recommended to user double instead of float
    }
}
