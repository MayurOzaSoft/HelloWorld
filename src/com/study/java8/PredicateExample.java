package com.study.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Smith", "Samueal", "Catley", "Sie");
        Predicate<String> stringPredicate = s -> s.startsWith("S");
        Predicate<String> lengthPredicate = s -> s.length() >= 5;
        names.stream().filter(stringPredicate.and(lengthPredicate)).forEach(System.out::println);
    }
}
