package com.study.datastructure.leetcode;

public class ArrayTest {

    public static void main(String[] args) {
        int[] array = new int[]{5,3,1,4,2};

        //positionData(array);

        //reverifySequence(array);

        //System.out.println(Arrays.toString(array));

        int[] arrayNew = new int[]{3, 5, 6, 3, 3, 5};

        //linearSort(arrayNew); // Arrays.sort(arrayNew); // Uses TimSort

        //findSmallestPositive(arrayNew);

        int count = 0;
        //printRepeating(arrayNew, arrayNew.length);
        
    }

    private static void linearSort(int[] arrayNew) {

        for (int i = 0; i < arrayNew.length; i++) {
            // Boundary Condition
            if(arrayNew[i] >= 0){
                if(arrayNew[i] < arrayNew[i-1]){
                    int temp =  arrayNew[i];
                    arrayNew[i] = arrayNew[i-1];
                    arrayNew[i-1] = temp;
                }
            } else {
                i ++;
            }
        }

    }

    private static void findDuplicateNumber(int[] arrayNew, int count) {
        for (int i = 1; i < arrayNew.length; i++) {
            if((arrayNew[i] - arrayNew[i-1]) == 0){

                //System.out.println(arrayNew[i]);
                count ++;
                //break;
            }
        }
    }

    private static void findSmallestPositive(int[] arrayNew) {

        int j = 0;
        for (int i = 1; i < arrayNew.length; i++) {
            // check negative
            if(arrayNew[i] > 0){
                // if Difference is more than 1 then we found missing
                if((arrayNew[i] - arrayNew[i-1]) > 1){
                    j ++;
                    System.out.println(j);
                    break;
                }
                j ++;
            }
        }
    }

    private static void reverifySequence(int[] array) {
        // complexity O(N)
        for (int i = 0; i < array.length - 1; i++) {
            if(array[i] > array[i + 1]){
                int temp = array[i + 1];
                array[i + 1] = array[i];
                array[i] = temp;
            }
        }
    }

    private static void positionData(int[] array) {
        // complexity O(N)
        for (int i = 0; i < array.length - 1; i++) {
            if(array[i] > 0 && array[i] != array[array[i] - 1]){
                int temp = array[array[i] - 1];
                array[array[i] - 1] = array[i];
                array[i] = temp;
            }
        }
    }
}
