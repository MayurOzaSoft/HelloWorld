package com.study.string.regularexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringRegularExpression {
    public static void main(String[] args) {

        // Case I
        /**
         * 1. Every number should contain 10 digits
         * 2. First digit should be 7 or 8 or 9
         *
         * [7-9][0-9]{9} >> [789][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9]
         * 10-11 digit >> 0?[7-9][0-9]{9}
         * 12 digit >> (0 | 91) ? [7-9][0-9]{9}
         *
         */

        // Case II
        /**
         * 1. valid email id's
         *
         * Answer:
         *      [a-zA-Z-0-9][a-zA-Z0-9_.]*@[a-zA-Z0-9]+([.][a-zA-Z]+)+
         *
         *      for only Gmail id's
         *      [a-zA-Z-0-9][a-zA-Z0-9_.]*@gmail[.]com
         */

        // Case III
        /**
         * Represent all Yava language identifiers
         * Rules :
         *  1. allowed characters are a to z, A to Z, 0 to 9 and #, $ symbol
         *  2. length of each identifier should be at least 2
         *  3. First character should be lower case alphabet symbol from a to k
         *  4. Second Character should a digit divisible by 3  (0-3-6-9)
         *
         * Answer:
         *      [a-k][0369][a-zA-Z0-9#$]*
         *
         */

        // Case IV
        /**
         * validate mobile number
         */
        Pattern pattern = Pattern.compile("(0|91)?[7-9][0-9]{9}");
        Matcher matcher = pattern.matcher("98146 41051");

        if(matcher.find())
            System.out.println("VALID NUMBER");
        else
            System.out.println("INVALID NUMBER");

        // Case V
        /**
         * Read all Mobile numbers present in input file
         */

        // Case VI
        /**
         * all .txt file names from particular location
         * [a-zA-Z0-9_.$]+[.]txt
         */

    }
}
