package com.study.datastructure.arrays;

public class Array {
    private int[] items;
    private int count;

    public Array(int length){
        this.items = new int[length];
    }

    public void print(){
        for (int i = 0; i < count; i++) {
            System.out.println(items[i]);
        }
    }

    public void insert(int item){
        if(items.length == count){

            int[] newArray = new int[count * 2];
            for (int i = 0; i < count; i++) {
                newArray[i] = items[i];
            }

            items = newArray;
        }
        items[count ++ ] = item;
    }

    public void removeAt(int index){
        if(index < 0 || index >= count)
            throw new IllegalArgumentException();
        for (int i = index; i < count; i++) {
            items[i] = items[i+1];
        }
        count --;
    }

    public int indexOf(int value){
        for (int i = 0; i < count ; i++) {
            if(items[i] == value){
                return i;
            }
        }
        return -1;
    }
}
