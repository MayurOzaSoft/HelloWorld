package com.study.primitives;

public class PrimitiveTypeChallenge {

    public static void main(String[] args0){
        // Challenge 1
        byte myTestByte = 10;
        short myTestShort = 20;
        int myTestInt = 50;

        long myTestLong = 50_000L +  10L * (myTestByte + myTestShort + myTestInt) ;
        System.out.println(myTestLong);

        short myTest = (short) (50_000 +  10 * (myTestByte + myTestShort + myTestInt));
        System.out.println(myTest);

        // Challenge 2 - Convert Pound to KiloGram
        // 1 Pound = 0.45359237

        double conversionDimension = 0.45359237d;
        double numberOfPound = 200d;
        double poundToKg = numberOfPound * conversionDimension;

        System.out.println(poundToKg + " KG ");

    }
}
