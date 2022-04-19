package com.javabanking;

import java.util.LinkedList;
import java.util.List;

public class TransactionDetails {

    public static List<Transaction> transactionList = new LinkedList<>();

    public static void addTransaction(Transaction t){
        transactionList.add(t);
    }

    public static void showStatement(int actNumber){
        System.out.println("statement for account numbe : "+ actNumber);
        System.out.println("---------------------------");
        for (Transaction t : transactionList) {
            if (t.getActNumber() == actNumber){
                System.out.println(t.getTransactionNumber()+ " "+ t.getTransactionType()+ " " + t.getTransactionAmount() +" " +t.getBalanceAfterThisTransaction());
            }

        }
    }

}
