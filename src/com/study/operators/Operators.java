package com.study.operators;

public class Operators {

    public static void main(String[] args) {
        int result = 200;
        System.out.println("Result :  " + result);
        result = result + 5; // Operands are result and 5, Operators used for calculation, = assignment operator
        System.out.println("200 +  5 = " + result);
        result = result - 5;
        System.out.println("205 -  5 = " + result);
        result = result * 5;
        System.out.println("200 *  5 = " + result);
        result = result / 5;
        System.out.println("1000 /  5 = " + result);
        result = result % 5;
        System.out.println("200 %  5 = " + result);

        // Abbreviation Operators

        // result = result + 1
        result++;
        System.out.println("0 + 1 = " + result);
        result--;
        System.out.println("1 - 1 = " + result);

        // result = result + 2
        result += 2;
        System.out.println("0 + 2 = " + result);

        result *= 5;
        System.out.println("2 * 5 = " + result);

        result /= 2;
        System.out.println("10 / 2 = " + result);

        result %= 2;
        System.out.println("5 % 2 = " + result);
    }
}
