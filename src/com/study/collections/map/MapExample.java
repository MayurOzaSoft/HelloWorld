package com.study.collections.map;

import com.study.oops.overriding.C;

import java.io.IOException;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.WeakHashMap;

public class MapExample {
    public static void main(String[] args) throws InterruptedException, IOException {

        // Hash Map
        HashMap hashMap = new HashMap();
        Integer integer1 = new Integer(10);
        Integer integer2 = new Integer(10);

        hashMap.put(integer1, "Test");
        hashMap.put(integer2, "java");

        System.out.println(integer1 == integer2);
        System.out.println(integer1.equals(integer2));

        System.out.println(hashMap); // {10=java}

        // IdentityHashMap
        IdentityHashMap identityHashMap  = new IdentityHashMap();

        identityHashMap.put(integer1, "Test");
        identityHashMap.put(integer2, "java");

        System.out.println(identityHashMap); // {10=java, 10=Test}

        // WeakHashMap
       // integer1 = null;
        System.gc();
        Thread.sleep(5000);

        System.out.println(hashMap);

        WeakHashMap weakHashMap = new WeakHashMap();
        C c = new C();
        weakHashMap.put(c,"Test");

        System.out.println(weakHashMap);
        c = null;
        System.gc();
        Thread.sleep(5000);

        System.out.println(weakHashMap); // {} objects gets destroyed

        /**
         * HashMap Dominates and object reference not destroyed
         */

    }
}
