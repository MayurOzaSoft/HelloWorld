package com.study.oops.instanceblock;

public class TestInstanceStatic {

    public static String test(String str){
        System.out.println(str);
        return str;
    }

    static String str = test("1");

    {
        str = test("2");
    }

    static
    {
        str = test("3");
    }

    public static void main(String[] args) {
        Object object = new TestInstanceStatic();
    }

    /**
     * 1. Sequence will be like here Instance variable loaded with default value
     * 2. execution of Instance blocks and member assignment
     * 3. Constructor Execution
     *
     */
}
