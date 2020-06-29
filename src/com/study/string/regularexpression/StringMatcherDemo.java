package com.study.string.regularexpression;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringMatcherDemo {

    public static void main(String[] args) {

        // String Test I
        String string = "abbaabba";
        int count = 0;

        Pattern pattern = Pattern.compile("ab");
        Matcher matcher = pattern.matcher(string);

        while(matcher.find()){
            count ++;
            System.out.println(matcher.start() + " : "+ matcher.end() + " : " + matcher.group());
        }

        System.out.println(count);

        System.out.println("-----------------------------");

        // String Test II
        String testString1 = "a3b#k@9z";

        pattern = Pattern.compile("[a-z]");
        matcher = pattern.matcher(testString1);

        while(matcher.find()){
            System.out.println(matcher.start() + " : "+ matcher.end() + " : " + matcher.group());
        }

        System.out.println("-----------------------------");

        // String Test III
        String testString2 = "a3b#k@9z asdasd";

        pattern = Pattern.compile(".");
        matcher = pattern.matcher(testString2);

        while(matcher.find()){
            System.out.println(matcher.start() + " : "+ matcher.end() + " : " + matcher.group());
        }

        System.out.println("-----------------------------");

        // String Test IV

        pattern = Pattern.compile("ab?"); // a, a+, a* and a?
        matcher = pattern.matcher(string);

        while(matcher.find()){
            System.out.println(matcher.start() + " : "+ matcher.end() + " : " + matcher.group());
        }

        System.out.println("-----------------------------");

        // String Test V

        pattern = Pattern.compile("\\s");
        String[] splitString = pattern.split("LEARN JAVA IN SIMPLE WAY");

        System.out.println(Arrays.toString(splitString));

        System.out.println("-----------------------------");


        // String Test V

        pattern = Pattern.compile("[.]");//  we can use [.] or \\.
        String[] splitString1 = pattern.split("LEARN.JAVA.IN.SIMPLE.WAY");

        System.out.println(Arrays.toString(splitString1));

        System.out.println("-----------------------------");

    }
}
