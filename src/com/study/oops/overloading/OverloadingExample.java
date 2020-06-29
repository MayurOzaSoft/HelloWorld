package com.study.oops.overloading;

import com.study.oops.A;
import com.study.oops.overriding.B;
import com.study.oops.overriding.C;

import java.io.IOException;

public class OverloadingExample {

    public static void main(String[] args) throws IOException {
        short s = 2;
        byte varByte = 1;
        Test test = new Test();
        // Automatic Promotion
        test.methodTest('c');
        test.methodTest(10.5f);
        test.methodTest(1);
        test.methodTest(1L);
        test.methodTest(s);
        test.methodTest(varByte);
        // Object Assignment
        test.methodTest(new Object());
        test.methodTest("Mayur");
        test.methodTest(new StringBuffer());
        // test.prn.methodTest(null); // Ambiguous problem both String and String Buffer are at same level which are extending Object

        test.methodTest(10, 10.5F);
        test.methodTest(10.5f, 10);

        // test.prn.methodTest(10, 10); // Ambiguous problem
        // test.prn.m

        // Var args
        test.methodTest();
        test.methodTest(10, 20, 30);
        test.methodTest(10); // Preference to old syntax as var args come after 1.5 version
        // test.prn.methodTest(10, 20); // Not method found, compilation error still var args present, if no other method found then varargs preferred
        /**
         * 1. While resolving overloaded methods, compiler will always use precedence for child type arguments when compared with parent type arguments
         * 2. Here String is Extending Object, Null can be passed as Object as well as String.
         * 3. For String Buffer Version we will have compile time error as in this case there
         *    is ambiguity problem as both string and stringBuffer are at same level
         * 4. Varargs preferred least priority as it acts exactly as Switch default case if not found execute default
         * 5. Runtime object won't play any role . . . see below example
         */

        C c = new C();
        A a = new A();
        B b = new B();
        A aNew = new B();
        c.methodA(a);
        c.methodA(b);
        c.methodA(aNew); // Based on method reference type

    }
}
