package com.study.operators;

public class OperatorChallenge {

    public static void main(String[] args) {
        // Step 1
        double firstDouble = 20.0d;
        // Step 2
        double secondDouble = 80.0d;
        // Step 3
        double resultDouble = (firstDouble + secondDouble) * 100.00d;
        // Step 4
        double reminder = resultDouble % 40.00d;
        // Step 5
        boolean isReminderZero = (reminder == 0) ? true : false;

        // Step 6
        System.out.println(isReminderZero);

        // Step 7
        if(!isReminderZero){
            System.out.println("Got Some Reminder");
        }
    }
}
