package com.study.datastructure.sorting.bubblesort;

public class BubbleSort {

    public int[] bubbleSort(int[] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if(array[j] > array[i]){
                    int swap = array[i];
                    array[i] = array[j];
                    array[j] = swap;
                }
            }
        }
        return array;
    }

    public int[] bubbleSortMethod(int[] array){
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if(array[j] > array[j + 1]){
                    int swap = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = swap;
                }
            }
        }
        return array;
    }
}
