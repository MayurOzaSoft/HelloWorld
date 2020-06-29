package com.study.advance.streams;

import com.study.advance.streams.data.TransactionEnum;
import com.study.advance.streams.transaction.Transaction;

import java.util.ArrayList;
import java.util.List;

public class TestData {

    public static List<Transaction> getTransactionData(){
        final List<Transaction> transactionList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Transaction transaction = new Transaction();
            transaction.setTransactionId(1234+i);
            transaction.setValue(500*i);
            transaction.setTransactionType(TransactionEnum.NETFLIX);
            transaction.setTransactionCurrency("EUR");
            transactionList.add(transaction);
        }
        return transactionList;
    }
}
