package com.study.datastructure.sorting.bubblesort;

import java.util.Arrays;

public class BubbleSortMain {
    public static void main(String[] args) {
        int[] array = new int[]{5,3,1,4,2};
        BubbleSort bubbleSort = new BubbleSort();
        array = bubbleSort.bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }
}
