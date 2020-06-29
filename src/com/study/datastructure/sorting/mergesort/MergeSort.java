package com.study.datastructure.sorting.mergesort;

public class MergeSort {

    public void sort(int[] array, int low, int high){

        if(high <= low) return;

        int mid = low +  (high - low)/2;
        sort(array, low, mid);
        sort(array, mid + 1, high);

        merge(array, low, mid, high);

    }

    private void merge(int[] array, int low, int mid, int high) {


    }
}
