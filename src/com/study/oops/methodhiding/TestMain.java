package com.study.oops.methodhiding;

public class TestMain {

    public static void main(String[] args) {

        TestParent.testParent();
        TestChild.testParent();

        TestChild testChild = new TestChild();
        testChild.testVarArgs(10);

        TestParent testParent = new TestParent();
        testParent.testVarArgs(10);

        // Method resolution will be based on reference object as it is considered as Overloading and not overriding
        // in case of var args we should have same method argument then it will be considered as overriding
        // vararg method will be override with vararg method only
        TestParent testParentRef = new TestChild();
        testParentRef.testVarArgs(10);

        // calling with varargs method
        testParentRef.testVarArgs(10, 20);

        System.out.println(testChild.i);
        System.out.println(testParent.i);
        System.out.println(testParentRef.i);
    }
}
