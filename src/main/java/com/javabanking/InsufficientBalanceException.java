package com.javabanking;

    public class InsufficientBalanceException extends Throwable {

        public String toString(){
            return "Balance not sufficient";
        }
}
