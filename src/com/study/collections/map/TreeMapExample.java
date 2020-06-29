package com.study.collections.map;

import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap treeMap = new TreeMap();
        treeMap.put(1, "JAVA");
        treeMap.put(2, "JAVA");
        treeMap.put(3, "JAVA");
        treeMap.put(4, 32131312);
        // treeMap.put("TEST", 32131312); // ClassCastException
        // treeMap.put(null, 32131312); // NullPointerException

        System.out.println(treeMap.firstEntry());
        System.out.println(treeMap);
    }
}
