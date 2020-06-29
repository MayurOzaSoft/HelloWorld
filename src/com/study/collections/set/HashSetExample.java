package com.study.collections.set;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        hashSet.add("A");
        hashSet.add(null);
        hashSet.add(10);
        hashSet.add("B");
        hashSet.add("C");
        hashSet.add("C");

        System.out.println(hashSet.add("A"));
        System.out.println(hashSet);

        /**
         * 1. Duplication not allowed
         * 2. Insertion order is not preserved
         */
    }
}
