package com.study.advance.streams.transaction;

import com.study.advance.streams.data.TransactionEnum;

public class Transaction {

    private int transactionId;
    private int value;
    private TransactionEnum transactionEnum;
    private String transactionCurrency;

    public int getValue() {
        return value;
    }

    public String getTransactionCurrency() {
        return transactionCurrency;
    }

    public void setTransactionCurrency(String transactionCurrency) {
        this.transactionCurrency = transactionCurrency;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
    }

    public TransactionEnum getTransactionType() {
        return transactionEnum;
    }

    public void setTransactionType(TransactionEnum transactionEnum) {
        this.transactionEnum = transactionEnum;
    }
}
