package com.study.advance.lambda.exercise.unit2;

public class ClosureExample {
    public static void main(String[] args) {
        int i = 10;
        int j = 20;

        doProcess(i, value ->  System.out.println(value + j));

        /**
         * Initially we used to access this using final keyword and possible to use this field
         * Since java 8 it is not required and it internally handles that and can be used like previous without final
         *
         * like we did here for j
         */
    }

    private static void doProcess(int i, Process process) {
        process.process(i);
    }
}
