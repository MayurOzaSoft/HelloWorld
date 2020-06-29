package com.study.advance.lambda;

public class LambdaExample {
    public static void main(String[] args) {
        LambdaExample lambdaExample = new LambdaExample();
        lambdaExample.greed(() -> System.out.println("INSIDE LAMBDA"));
    }

    public void greed(Greeting greeting){
        greeting.perform();
    }
}
