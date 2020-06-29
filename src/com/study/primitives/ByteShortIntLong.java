package com.study.primitives;

public class ByteShortIntLong {

    public static void main (String[] args0){
        int myValue = 10000;

        // Integer Data Type
        int myMinimumInt = Integer.MIN_VALUE;
        int myMaximumInt = Integer.MAX_VALUE;

        System.out.println("myMinimumInt Value : " + myMinimumInt);
        System.out.println("myMaximumInt Value : " + myMaximumInt);

        System.out.println("myMinimumInt Value Busted : " + (myMinimumInt - 1));
        System.out.println("myMaximumInt Value Busted : " + (myMaximumInt + 1));

        int myMaximumIntTest = 2_147_483_647;
        System.out.println(myMaximumIntTest);

        // Byte Data Type
        byte myMinimumByte = Byte.MIN_VALUE;
        byte myMaximumByte = Byte.MAX_VALUE;

        System.out.println("myMinimumByte Value : " + myMinimumByte);
        System.out.println("myMaximumByte Value : " + myMaximumByte);

        // Short Data Type
        short myMinimumShort = Short.MIN_VALUE;
        short myMaximumShort = Short.MAX_VALUE;

        System.out.println("myMinimumShort Value : " + myMinimumShort);
        System.out.println("myMaximumShort Value : " + myMaximumShort);

        short myMaximumShortTest = 32_767;

        // Long Data Type
        long myLongValue = 1000;
        long myMinimumLong = Long.MIN_VALUE;
        long myMaximumLong = Long.MAX_VALUE;

        System.out.println(myLongValue);
        System.out.println("myMinimumLong Value : " + myMinimumLong);
        System.out.println("myMaximumLong Value : " + myMaximumLong);

        long myMaximumLongTest = 2_147_483_647_234L;
        System.out.println(myMaximumLongTest);

        // Casting
        short myShortNumber = (short) (myMinimumShort / 2);
        byte myByteNumber = (byte) (myMinimumByte / 2);
    }
}
