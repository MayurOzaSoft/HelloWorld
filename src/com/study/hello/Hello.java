package com.study.hello;

public class Hello {

    public static void main (String[] args0){
        // First Programme
        System.out.println("HELLO WORLD FROM INTELLIJ IDEA");
        System.out.println("com.study.hello.Hello, Mayur");

        // Variable and assignment
        int myFirstVariableName = 5;
        int mySecondVariableName = 12;
        int myThirdVariableName = myFirstVariableName * 6;

        // Operator addition
        int myTotalNumber = myFirstVariableName + mySecondVariableName + myThirdVariableName;
        System.out.println("myTotalNumber : " + myTotalNumber); // "myTotalNumber" called as String literal

        int myLastOne = 1000 - myTotalNumber;
        System.out.println("myLastOne : " + myLastOne);
    }
}
