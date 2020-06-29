package com.study.collections.list;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        Vector vector = new Vector();
        System.out.println(vector.capacity());

        for (int i = 0; i <= 10 ; i++) {
            vector.addElement(i);
        }

        System.out.println(vector.capacity());

        vector.addElement(23);
        System.out.println(vector.capacity());
        System.out.println(vector);

        Enumeration enumeration = vector.elements();

        while(enumeration.hasMoreElements()){
            Integer integer = (Integer) enumeration.nextElement();
            if(integer % 2 == 0){
                System.out.println(integer); // 0,2,4,6,8,10
            }
        }

        /**
         * 1. max default size of vector is 10
         * 2. after that size of vector increases with formula currentSize*2
         * 3. Vector has feature to increase size based on your requirement
         */
    }
}
