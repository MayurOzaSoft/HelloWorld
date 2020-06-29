package com.study.advance.streams;

import com.study.advance.streams.transaction.Transaction;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamRevision {
    public static void main(String[] args) {
        List<Transaction> transactionList = TestData.getTransactionData();

        // Summarizing
        long numberOfTransaction = transactionList.stream().collect(Collectors.counting());
        System.out.println(numberOfTransaction);

        System.out.println("------------------------------------");

        // Summing - summingInt, summingDouble, summingLong
        int totalSum = transactionList.stream().collect(Collectors.summingInt(Transaction::getValue));
        System.out.println(totalSum);

        System.out.println("------------------------------------");

        //Averaging - averagingInt, averagingDouble, averagingLong
        double averagingInt = transactionList.stream().collect(Collectors.averagingInt(Transaction::getValue));
        System.out.println(averagingInt);

        System.out.println("------------------------------------");
        // maxBy and minBy
        transactionList.stream().collect(Collectors.maxBy(Comparator.comparing(Transaction::getValue))).ifPresent(System.out::println);

        System.out.println("------------------------------------");

        // reducing - work exactly similar as reduce operation
        int sumValue = transactionList.stream().collect(Collectors.reducing(0,Transaction::getValue,Integer::sum));
        System.out.println(sumValue);

        System.out.println("------------------------------------");

        // Grouping
        Map<String, List<Transaction>> transactionsByCurrencies = transactionList.stream().collect(Collectors.groupingBy(Transaction::getTransactionCurrency));
        System.out.println(transactionsByCurrencies);

        System.out.println("------------------------------------");
        // Partition By
        Map<Boolean, List<Transaction>> stringListMap = transactionList.stream().collect(Collectors.partitioningBy(transaction -> transaction.getValue() > 1000));
        System.out.println(stringListMap);

        System.out.println("------------------------------------");



    }
}
