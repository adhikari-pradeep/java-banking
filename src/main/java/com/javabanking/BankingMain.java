package com.javabanking;

public class BankingMain {

  public static void main(String[] args) {

      BankAccount b1 = new BankAccount(101,"Ravi", 15000);

      BankAccount b2 = new BankAccount(102,"Scott", 25000);

      b1.deposit(1000);
      b1.deposit(500);
      b1.deposit(700);
      b1.withdraw(350);
      b1.withdraw(300);
      b1.deposit(500);

      System.out.println("------------------");
      TransactionDetails.showStatement(101);
  }
}
