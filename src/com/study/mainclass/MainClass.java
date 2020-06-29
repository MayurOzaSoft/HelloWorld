package com.study.mainclass;

public class MainClass {

    static int x;

    static strictfp public void main(String... var) {
        System.out.println("Main Valid here!!!");
    }

    /**
     * 1. public static void main(String[] args)
     * 2. static public void main(String[] args)
     * 3. static public void main(String... var)
     * 4. static final public void main(String... var)
     * 5. static final synchronized strictfp public void main(String... var)
     * 6. static final strictfp public void main(String... var)
     */
}
