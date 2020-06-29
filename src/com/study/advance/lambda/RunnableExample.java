package com.study.advance.lambda;

public class RunnableExample {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> System.out.println("Runnable"));
        thread.run();
    }
}
