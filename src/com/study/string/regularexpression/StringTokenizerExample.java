package com.study.string.regularexpression;

import java.util.StringTokenizer;

public class StringTokenizerExample {
    public static void main(String[] args) {
        StringTokenizer stringTokenizer = new StringTokenizer("JAVA DEMO TEST");
        while(stringTokenizer.hasMoreElements()){
            System.out.println(stringTokenizer.nextToken());
        }

        stringTokenizer = new StringTokenizer("2018-04-19", "-");
        while(stringTokenizer.hasMoreElements()){
            System.out.println(stringTokenizer.nextToken());
        }

        /**
         * 1. Default regular expression is SPACE i.e. " ","\\s"
         * 2. for Customized we need to specify Delim, expression or Patter like "-"
         */
    }
}
