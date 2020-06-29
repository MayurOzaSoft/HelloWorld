package com.study.collections.set;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add("A");
        linkedHashSet.add(null);
        linkedHashSet.add(10);
        linkedHashSet.add("B");
        linkedHashSet.add("C");
        linkedHashSet.add("C");

        System.out.println(linkedHashSet.add("A"));
        System.out.println(linkedHashSet);

        /**
         * 1. Duplication not allowed
         * 2. Insertion order is preserved
         */

    }
}
