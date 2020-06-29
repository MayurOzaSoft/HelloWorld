package com.study.datastructure.sorting.quicksort;

import java.util.Arrays;

public class QuickSortMain {
    public static void main(String[] args) {
        int[] array = new int[]{7,3,2,5,6,7,1};

        QuickSort quickSort = new QuickSort();
        quickSort.sort(array, 0, array.length - 1);

        System.out.println(Arrays.toString(array));

        /**
         * 1. Time Complexity O(n^2)
         * 2. space complexity O(log(n))
         *
         */
    }
}
