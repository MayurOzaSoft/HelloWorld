package com.study.advance.lambda;

public class TypeInferenceExample {
    public static void main(String[] args) {
        StringLengthLambda stringLengthLambda = string -> string.length();
        System.out.println(stringLengthLambda.getLength("TEST STRING LAMBDA"));
    }

    interface StringLengthLambda {
        int getLength(String string);
    }
}
