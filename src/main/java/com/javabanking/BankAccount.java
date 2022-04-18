package com.javabanking;

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

    }
    public void withdraw(int withdrawAmount){
    if (actBalance > withdrawAmount) {
//        throw new InsufficientBalanceException();
        }


        actBalance -= withdrawAmount;
    }
}
