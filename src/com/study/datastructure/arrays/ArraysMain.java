package com.study.datastructure.arrays;

/**
 * Build Dynamic Array
 */
public class ArraysMain {
    public static void main(String[] args) {
        Array array = new Array(3);
        array.insert(2);
        array.insert(3);
        array.insert(4);
        array.insert(8);
        array.insert(9);
        array.removeAt(4);
        array.print();
        System.out.println(array.indexOf(8));
    }
}
