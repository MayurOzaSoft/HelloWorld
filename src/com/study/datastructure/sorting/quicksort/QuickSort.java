package com.study.datastructure.sorting.quicksort;

public class QuickSort {

    public void sort(int[] array, int low, int high){

        if(low > high) return;
        partition(array, low, high);

    }

    private void partition(int[] array, int low, int high) {

        int mid = low + (high-low)/2;
        int pivot = array[mid];

        int i = low;
        int j = high;

        while(i <= j){

            while(array[i] < pivot)
                i ++;

            while(array[j] > pivot)
                j --;

            if(i <= j){
                swap(array, i, j);
                i ++;
                j --;
            }
        }

        if(low < j)
            partition(array, low, j);

        if(high > i)
            partition(array, i, high);

    }

    private void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }


}
