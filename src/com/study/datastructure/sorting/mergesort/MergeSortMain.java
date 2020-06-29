package com.study.datastructure.sorting.mergesort;

import java.util.Arrays;

public class MergeSortMain {
    public static void main(String[] args) {
        int[] inputArray = {1, 5, 4, 7, -4, 8,9, 2, 7};
        MergeSort mergeSort = new MergeSort();
        mergeSort.sort(inputArray, 0, inputArray.length - 1 );
        System.out.println(Arrays.toString(inputArray));
    }
}
