package com.study.collections.list;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {

        LinkedList linkedList = new LinkedList();
        linkedList.add("Mayur");
        linkedList.add(100);
        linkedList.add(null);
        linkedList.add("Test");
        linkedList.addFirst("Demo");
        linkedList.set(0, "World");
        linkedList.remove(3);
        linkedList.removeFirst();
        linkedList.addLast("Java");

        System.out.println(linkedList); // [Mayur, 100, Test, Java]
    }
}

