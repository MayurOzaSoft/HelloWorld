package com.study.collections.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollectionsExample {

    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("Z");
        arrayList.add("X");
        arrayList.add("V");
        arrayList.add("A");
        arrayList.add("S");
        arrayList.add("L");
        arrayList.add("U");

        System.out.println(arrayList);

        // Default natural sorting order
        Collections.sort(arrayList);

        System.out.println(arrayList);

        // search element location
        System.out.println(Collections.binarySearch(arrayList, "V"));

        // gives Insertion point where we can put this element
        System.out.println(Collections.binarySearch(arrayList, "Q"));

        Collections.reverse(arrayList);

        System.out.println(arrayList);

        Comparator comparator = Collections.reverseOrder(); // ReverseComparator

        System.out.println(comparator);

    }
}
