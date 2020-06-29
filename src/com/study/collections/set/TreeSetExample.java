package com.study.collections.set;

import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet treeSet = new TreeSet();
        // treeSet.add(null); // Null Pointer Exception

        treeSet.add("A");
        treeSet.add("a");
        treeSet.add("Z");
        treeSet.add("W");
        treeSet.add("w");
        treeSet.add("T");
        treeSet.add("P");
        treeSet.add("M");


        // treeSet.add(10); // ClassCastException
        // treeSet.add(null); // Null Pointer Exception

        System.out.println(treeSet);

        // StringBuffer
        TreeSet treeSet1 = new TreeSet();
        treeSet1.add(new StringBuffer("A"));
        treeSet1.add(new StringBuffer("Z"));
        treeSet1.add(new StringBuffer("L"));
        treeSet1.add(new StringBuffer("B"));
        treeSet1.add(new StringBuffer("b"));
        System.out.println(treeSet1);

        // add Integer object to tree set to provide sorting order as DESC

        TreeSet treeSet2 = new TreeSet(((o1, o2) -> {
            if((Integer)o2 > (Integer) o1){
                return 1;
            } else if((Integer)o2 < (Integer) o1){
                return -1;
            } else
                return 0;
        })); // if we have not passed Comparator object then internally JVM will call compareTo method which sort in default natural sorting order


        treeSet2.add(10);
        treeSet2.add(0);
        treeSet2.add(15);
        treeSet2.add(5);
        treeSet2.add(20);
        treeSet2.add(20);

        System.out.println(treeSet2);

        // Insert String object in TreeSet and all elements should be inserted according to reverse of alphabetical order

        TreeSet treeSet3 = new TreeSet(((o1, o2) -> {

            int i = o2.toString().compareTo(o1.toString());

            if(i > 0){
                return 1;
            } else if(i < 0){
                return -1;
            } else {
                return 0;
            }
        }));

        treeSet3.add("TEST");
        treeSet3.add("JAVA");
        treeSet3.add("WAR");
        treeSet3.add("EAR");

        System.out.println(treeSet3);

        /**
         * 1. Only Homogeneous elements are allowed in TreeSet
         * 2. Null insertion allowed in java 1.6
         * 3. Null insertion now allowed in from java 1.7 onwards and it will throw NPE
         */

    }
}
