package com.study.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Smith", "Gourav", "Heather", "John", "Catania");
        Function<String, Integer> integerFunction = String::length;
        List<Integer> collect = names.stream().map(integerFunction).collect(Collectors.toList());
        System.out.println(collect);
    }
}
