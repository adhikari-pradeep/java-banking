package com.javabanking;

import java.util.Random;

public class BankAccount {

    private int actNumber;
    private String customerName;
    private int actBalance;

    public BankAccount(int actNumber, String customerName, int actBalance) {
        this.actNumber = actNumber;
        this.customerName = customerName;
        this.actBalance = actBalance;
    }

    public int getActNumber() {
        return actNumber;
    }

    public void setActNumber(int actNumber) {
        this.actNumber = actNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getActBalance() {
        return actBalance;
    }

    public void setActBalance(int actBalance) {
        this.actBalance = actBalance;
    }

    public void deposit(int depositAmount){
        actBalance +=  depositAmount;
        Random r = new Random();
        /* after deposit, store deposit details */

        Transaction t = new Transaction(r.nextInt(),
                actNumber, depositAmount, "deposit", actBalance);
        TransactionDetails.addTransaction(t);
        System.out.println("deposit completed and stored....");


    }

    public void withdraw(int withdrawAmount){

        Random r = new Random();
        Transaction t = new Transaction(r.nextInt(),
                actNumber, withdrawAmount, "withdraw", actBalance);
    if (actBalance < withdrawAmount) {
        try {
            throw new InsufficientBalanceException();
        } catch (InsufficientBalanceException e) {
            e.printStackTrace();
        }
    }


        actBalance -= withdrawAmount;
    }
}
