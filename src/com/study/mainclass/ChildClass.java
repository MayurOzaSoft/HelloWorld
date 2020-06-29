package com.study.mainclass;

public class ChildClass extends MainClass {

    // you can extend MainClass with Main Method
    public static void main(String... args) {
        System.out.println("Child Main Class");
    }

    public void main(int... args) {
        System.out.println("Child Main Class with Int");
    }

    /**
     * 1. Overloading Possible with Main Class
     * 2. Overriding is not allowed but It is considered as Static Method Hiding
     * 3. Inheritance allowed with Main Method
     */
}
