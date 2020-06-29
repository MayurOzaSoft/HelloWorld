package com.study.collections.map;

import java.util.Hashtable;
import java.util.Properties;

public class HashtableExample {
    public static void main(String[] args) {
        Hashtable hashtable = new Hashtable(25);
        hashtable.put(new TestHash(5), "A");
        hashtable.put(new TestHash(2), "B");
        hashtable.put(new TestHash(6), "C");
        hashtable.put(new TestHash(15), "D");
        hashtable.put(new TestHash(23), "E");
        hashtable.put(new TestHash(16), "F");
        // hashtable.put(null, "F"); // NullPointerException
        System.out.println(hashtable);

        /**
         * 1. Based on hashCode of Key Values are stored
         * 2. Default size of HashTable is 11
         * 3. If we change HashCode formula there is change in output of your hashTable
         */
    }
}
