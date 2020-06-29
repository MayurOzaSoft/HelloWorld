package com.study.oops.staticflow;

public class TestStatic {

    static int i = 10; // 1  >> i = 0 (RIWO) Read indirectly and write only
    static {           // 2
        test();
        TestStatic testStatic = new TestStatic();
        System.out.println("First Static : " + i); // Direct Read
        /**
         * if j then there will be error >> illegal forward Reference
         * as there will Direct Read
         */

    }

    {
        System.out.println("Inside Instance Block 1");
    }

    public static void main(String[] args) { // 3
        test();
        System.out.println("Main Method");
    }

    public static void  test(){ // 4
        System.out.println("Insider Test Method : " + j); // Indirect Read
    }

    static {                    // 5
        System.out.println("Second Static");
    }

    static {                    // 6
        System.out.println("Third Static");
    }

    static int j = 20;          // 7 >> j = 0 (RIWO) Read indirectly and Write Only

    {
        System.out.println("Inside Instance Block 2");
    }
    /**
     * 1. Identify All Static members from top to bottom
     * 2. Execute of static variable assignment and static block execution
     * 3. Execution of main method
     *
     */
}

