package com.javabanking;

public class Transaction {
    private int transactionNumber;
    private int actNumber;
    private int transactionAmount;
    private String transactionType;
    private int balanceAfterThisTransaction;

    public Transaction(int transactionNumber, int actNumber, int transactionAmount, String transactionType, int balanceAfterThisTransaction) {
        this.transactionNumber = transactionNumber;
        this.actNumber = actNumber;
        this.transactionAmount = transactionAmount;
        this.transactionType = transactionType;
        this.balanceAfterThisTransaction = balanceAfterThisTransaction;
    }

    public int getTransactionNumber() {
        return transactionNumber;
    }

    public void setTransactionNumber(int transactionNumber) {
        this.transactionNumber = transactionNumber;
    }

    public int getActNumber() {
        return actNumber;
    }

    public void setActNumber(int actNumber) {
        this.actNumber = actNumber;
    }

    public int getTransactionAmount() {
        return transactionAmount;
    }

    public void setTransactionAmount(int transactionAmount) {
        this.transactionAmount = transactionAmount;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public int getBalanceAfterThisTransaction() {
        return balanceAfterThisTransaction;
    }

    public void setBalanceAfterThisTransaction(int balanceAfterThisTransaction) {
        this.balanceAfterThisTransaction = balanceAfterThisTransaction;
    }
}
