package com.study.datastructure.sorting.normalsort;

import java.util.Arrays;

public class NormalSortMain {
    public static void main(String[] args) {

        int[] arrayOld = new int[]{5,3,1,4,2};

        boolean isShifted = true;
        // O(N)
        while(isShifted){
            // O(N)
            isShifted = sortArray(arrayOld);
        }

        // TOTAL COMPLEXITY O(N*N)
        System.out.println(Arrays.toString(arrayOld));
    }

    private static boolean sortArray(int[] arrayOld) {
        boolean isShifted = false;
        for (int i = 1; i < arrayOld.length; i++) {
            if(arrayOld[i] < arrayOld[i - 1]){
                int temp = arrayOld[i - 1];
                arrayOld[i - 1] = arrayOld[i];
                arrayOld[i] = temp;
                isShifted = true;
            }
        }
        return isShifted;
    }
}
