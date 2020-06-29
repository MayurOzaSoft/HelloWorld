package com.study.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class ConsumerExample {
    public static void main(String[] args) {

        Consumer consumer = System.out::println;

        Stream<String> stringStream = Stream.of("TEST 1", "TEST 2");
        stringStream.forEach(consumer);

        List<String> stringList = Arrays.asList("Sydney", "Mumbai");

        Consumer<List<String>> consumerUpperCase = list -> {
            for (int i = 0; i < list.size(); i++) {
                list.set(i, list.get(i).toUpperCase());
            }
        };

        Consumer<List<String>> printConsumer = list -> list.stream().forEach(System.out::println);

        consumerUpperCase.andThen(printConsumer).accept(stringList);


    }
}
