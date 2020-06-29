package com.study.advance.streams;

import com.study.advance.streams.data.TransactionEnum;
import com.study.advance.streams.transaction.Transaction;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamMain {
    public static void main(String[] args) throws IOException {

        // Regular Approach
        List<Transaction> groceryTransactions = new ArrayList<>();
        List<Transaction> transactions = TestData.getTransactionData();
        for(Transaction t : transactions){
            if(t.getTransactionType() == TransactionEnum.NETFLIX){
                groceryTransactions.add(t);
            }
        }

        Collections.sort(groceryTransactions, new Comparator<Transaction>() {
            @Override
            public int compare(Transaction t1, Transaction t2) {
                return ((Integer) t2.getTransactionId()).compareTo((Integer) t1.getTransactionId());
            }
        });

        List<Integer> transactionIds = new ArrayList<>();
        for(Transaction t: groceryTransactions){
            transactionIds.add(t.getTransactionId());
        }

        transactionIds.stream().forEach(t -> System.out.println(t));

        // Java 8 Approach
        transactionIds = groceryTransactions.stream()
                .filter(transaction -> transaction.getTransactionType() == TransactionEnum.NETFLIX)
                .sorted(Comparator.comparing(Transaction::getTransactionId).reversed())
                .map(Transaction::getTransactionId)
                .collect(Collectors.toList());

        System.out.println("--------------------------------------");
        transactionIds.stream().forEach(t -> System.out.println(t));

        // java SE 8 Parallel Stream()
        transactionIds = groceryTransactions.parallelStream()
                .filter(transaction -> transaction.getTransactionType() == TransactionEnum.NETFLIX)
                .sorted(Comparator.comparing(Transaction::getTransactionId).reversed())
                .map(Transaction::getTransactionId)
                .collect(Collectors.toList());

        System.out.println("--------------------------------------");

        Stream.of(transactions.toArray())
                .forEach(t -> System.out.println(t));

        System.out.println("--------------------------------------");

        transactions.stream().map(Transaction::getTransactionId).collect(Collectors.toList()).stream().forEach(System.out::println);

        System.out.println("--------------------------------------");
        transactions.stream().max(Comparator.comparing(Transaction::getTransactionId)).stream().forEach(System.out::println);

        System.out.println("--------------------------------------");
        transactions.stream().limit(2).forEach(System.out::println);

        System.out.println("--------------------------------------");
        List<Integer> integerList = Arrays.asList(1,2,3,4,5,6,7,8);

        List<Integer> integers = integerList.stream()
                .filter(integer -> {
                    System.out.println("Inside Filter");
                    return integer % 2 == 0;
                })
                .map(integer -> {
                    System.out.println("Inside Map");
                    return integer * integer;
                })
                .limit(2)
                .collect(Collectors.toList());

        integers.stream().forEach(integer -> System.out.println(integer));

        System.out.println("--------------------------------------");
        // filter and matching
        // allMatch, anyMatch and noneMatch
        boolean bool = integers.stream().allMatch(integer -> integer > 1235);
        System.out.println(bool);

        System.out.println("--------------------------------------");
        // findAny, findFirst
        integers.stream().filter(integer -> integer > 3).findAny().ifPresent(System.out::println);

        System.out.println("--------------------------------------");

        // mapping method >> Take as function and produces Stream
        List<String> words = Arrays.asList("Oracle", "Java", "Magazine");
        List<Integer> wordLengths = words.stream().map(String::length).collect(Collectors.toList());
        wordLengths.stream().forEach(System.out::println);

        System.out.println("--------------------------------------");
        // reduce
        // Regular Approach - to find sum of word lengths
        int sum = 0;
        for (int x : wordLengths) {
            sum += x;
        }

        // Java SE 8 Approach - using reduce
        int total = wordLengths.stream().reduce(0, (i, j) -> i + j);
        System.out.println(total);

        int multiply = wordLengths.stream().reduce(1, (i, j) -> i * j);
        int maxValue = wordLengths.stream().reduce(1, Integer::max);

        System.out.println(multiply);
        System.out.println(maxValue);

        System.out.println("--------------------------------------");

        // Numeric Streams
        // mapToInt >> IntStream, mapToLong >> LongStream, mapToDouble >> DoubleStream
        int sumWords = wordLengths.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sumWords);

        // Numeric Ranges
        // range is exclusive and rangeClosed it inclusive
        IntStream intStreamRange = IntStream.range(1, 5).filter(value -> value > 3);
        IntStream intStreamRangeClosed = IntStream.rangeClosed(1, 5).filter(value -> value > 3);
        System.out.println(intStreamRange.count());
        System.out.println(intStreamRangeClosed.count());

        System.out.println("--------------------------------------");

        // Building Streams
        Stream<Integer> numbersFromValues = Stream.of(1, 2, 3, 4);
        // IntStream
        int[] numbers = {1, 2, 3, 4};
        IntStream numbersFromArray = Arrays.stream(numbers);
        // File Stream
        long numberOfLines =
                Files.lines(Paths.get("C:\\Users\\mayur.p.ozardekar\\Documents\\IntelliJWorkspace\\HelloWorld\\src\\readme_jvm.md"), Charset.defaultCharset())
                        .count();
        System.out.println(numberOfLines);

        System.out.println("--------------------------------------");

        // Infinite Streams - iterate
        Stream<Integer> numbersInfiniteStreams = Stream.iterate(0, n -> n + 10);
        numbersInfiniteStreams.limit(5).forEach(System.out::println);

        System.out.println("--------------------------------------");
        // Infinite Streams - generate
        Stream nextInt = Stream.generate(new Random()::nextInt);
        nextInt.limit(5).forEach(System.out::println);

        System.out.println("--------------------------------------");

        // 2 Intermediate Operation(filter and map) and 1 Terminal Operation (reduce)
        int sumTransaction = transactions.stream().filter(transaction -> transaction.getValue() > 1000).map(Transaction::getValue).reduce(0,Integer::sum);
        System.out.println(sumTransaction);

        System.out.println("--------------------------------------");
        // flat Map
        Stream<String> wordsTech = Stream.of("Java", "Magazine", "is", "the", "best");
        Map<String, Long> stringIntegerMap = wordsTech.map(s -> s.split("")).flatMap(Arrays::stream).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        stringIntegerMap.forEach((s, aLong) -> System.out.println(s + " : "+aLong));

        System.out.println("--------------------------------------");
        System.out.println(stringIntegerMap);

        System.out.println("--------------------------------------");
        // find Unique words from given file
        Files.lines(Paths.get("C:\\Users\\mayur.p.ozardekar\\Documents\\IntelliJWorkspace\\HelloWorld\\src\\readme_jvm.md")
                , Charset.defaultCharset())
                .map(line -> line.split("\\s+"))
                .flatMap(Arrays::stream)
                .distinct()
                .limit(10)
                .forEach(System.out::println);
        // flat map has effect of replacing each generated array not by Stream but by it's content if you have not used flat map this will produce Stream of String[]

        /**
         * 1. It build query, where map operation is parametrised to extract Transaction ID and collect uses that Stream and convert it to List
         * 2. In above we may see result has not followed the sequence of execution, this is because it used limit(2) which uses "Short-circuiting"
         * 3. It works like sequence of boolean check and when and comes with false it breaks (it implies we don't have to perform all operations and limiting it 2)
         * 4. other intermediate operations such as filter and map produces same pass with streams
         * 5. flatMap is a common pattern, when dealing with Optional or CompletableFuture .
         *      - flatMap lets you replace each value of a stream with another stream, and then it concatenates all the generated streams into one single stream
         */

    }
}
