package com.study.advance.lambda.exercise.unit3;

public class MethodReferenceExample {
    public static void main(String[] args) {
        Thread thread = new Thread(MethodReferenceExample::printMessage); // () -> printMessage() replacement for it
        thread.run();
    }

    public static void printMessage(){
        System.out.println("INSIDER OF THREAD");
    }
}
