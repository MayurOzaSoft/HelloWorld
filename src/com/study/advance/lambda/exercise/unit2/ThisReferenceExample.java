package com.study.advance.lambda.exercise.unit2;

public class ThisReferenceExample {
    private void doProcess(int i, Process process) {
        process.process(i);
    }

    private void execute() {
        doProcess(20, value ->  {
            System.out.println("Value of i : "+ value);
            System.out.println(this); // Here it is allowed but will give us exact same reference which is outside of the lambda
        });
    }

    public static void main(String[] args) {
        ThisReferenceExample thisReferenceExample = new ThisReferenceExample();
        thisReferenceExample.doProcess(10, i ->  {
            System.out.println("Value of i : "+ i);
            // System.out.println(this); // This is not allowed in case of Lambda process
        });

        thisReferenceExample.execute();

        thisReferenceExample.doProcess(10, new Process() {
            @Override
            public void process(int i) {
                System.out.println("Value of i : "+ i);
                System.out.println(this);
            }
        });
    }
}
