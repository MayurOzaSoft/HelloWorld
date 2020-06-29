package com.study.collections.map;

import java.util.TreeMap;

public class NavigableMapExample {
    public static void main(String[] args) {
        TreeMap treeMap = new TreeMap();
        treeMap.put("A", "ASCII");
        treeMap.put("B", "Beyoond Comapare");
        treeMap.put("C", "C++");
        treeMap.put("D", "DJango");
        treeMap.put("E", "Element");

        System.out.println(treeMap);
        System.out.println(treeMap.ceilingKey("A")); // A
        System.out.println(treeMap.floorEntry("B")); // B
        System.out.println(treeMap.lowerKey("C")); // B
        System.out.println(treeMap.higherKey("A")); // B
        System.out.println(treeMap.pollFirstEntry()); // A=ASCII
        System.out.println(treeMap.pollLastEntry()); // E=ELEMENT
        System.out.println(treeMap.descendingMap()); // D, C, B
        System.out.println(treeMap); // B, C, D

    }
}
