package com.study.collections.set;

import java.util.TreeSet;

public class NavigableSetExample {
    public static void main(String[] args) {
        TreeSet treeSet = new TreeSet();

        treeSet.add(1000);
        treeSet.add(2000);
        treeSet.add(3000);
        treeSet.add(4000);
        treeSet.add(5000);
        treeSet.add(6000);
        treeSet.add(7000);

        System.out.println(treeSet);
        System.out.println(treeSet.ceiling(2000));// 2000
        System.out.println(treeSet.higher(4000)); // 5000
        System.out.println(treeSet.floor(3000)); // 3000
        System.out.println(treeSet.lower(3000)); // 2000
        System.out.println(treeSet.pollFirst()); // 1000
        System.out.println(treeSet.pollLast()); // 7000
        System.out.println(treeSet.descendingSet()); // 6000, 5000, 4000, 3000, 2000
        System.out.println(treeSet); // 2000, 3000, 4000, 5000, 6000
    }

}
