package com.study.lang;

import com.study.oops.overloading.Test;

import java.lang.reflect.Method;
import java.util.Arrays;

public class LangPackageMain {
    public static void main(String[] args) throws ClassNotFoundException {
        Class aClass = Class.forName("java.lang.Object");
        Method[] methods = aClass.getMethods();

        System.out.println(Arrays.stream(methods).count());

        Test test = new Test();
        System.out.println(test.toString());

        TestLang testLang = new TestLang(10, "LANG DEMO");
        TestLang testLang2 = new TestLang(10, "LANG DEMO");
        TestLang testLang3 = testLang;

        System.out.println(testLang2);
        System.out.println(testLang.toString());
        System.out.println(testLang.hashCode());
        System.out.println(testLang2.hashCode());

        System.out.println(testLang.getName());

        System.out.println(testLang.equals(testLang2));
        System.out.println(testLang.equals(testLang3));

        /**
         * Object class equals method meant for Reference comparison
         *
         * public boolean equals(Object obj) {
         *         return (this == obj);
         * }
         *
         */
    }
}
