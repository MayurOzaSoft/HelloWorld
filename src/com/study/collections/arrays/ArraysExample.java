package com.study.collections.arrays;

import java.util.Arrays;
import java.util.List;

public class ArraysExample {

    public static void main(String[] args) {
        int[] intArray = { 1, 5, 8, 2, 9};
        Arrays.sort(intArray);
        System.out.println(Arrays.toString(intArray));

        String[] strArray = { "Z", "J", "O", "P", "A"};
        Arrays.sort(strArray);
        System.out.println(Arrays.toString(strArray));

        List listArray = Arrays.asList(intArray);
        listArray.stream().forEach(System.out::println);

        for (Object i :listArray) {
            System.out.println(i);
        }
    }
}
