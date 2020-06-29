package com.study.oops;

import com.study.oops.overriding.B;
import com.study.oops.overriding.C;
import com.study.oops.overriding.TestC;

import java.io.IOException;

public class CoupledMain {

    public static void main(String[] args) throws IOException {
        C c = new C();
        c.iA = 12; // is accessible as it's modifier is default

        // Parent Method
        B b = new B();
        b.methodA(new A());

        // Child Method
        c.methodA(new A());

        // Possible to access as it is public
        // c.methodTest();

        // Parent Reference Method
        B bChild = new C();
        bChild.methodA(new A());

        TestC testC = new TestC();
        TestC.methodStatic(bChild);

        /**
         * For tightly coupled class it has to be consider it's corresponding parent class + itself should have all data members are private
         * Here if you see C Extends B and B Extends A
         * B and C has all Data Members are private but in Class A Data member is default
         * Possible to access by Object of C like above :  c.iA = 12;
         */

        /**
         * 1. In Overriding Method resolution will be based on runtime Object
         * 2. called as "Runtime Polymorphism" or "Dynamic Polymorphism" or "Late Binding"
         */

    }
}
