package com.university.java.semester3and5.encapsulation.advanced;

public class TransactionUtil {
    public static void deposit(double amount, BankAccount account){
        account.deposit(amount);
    }
    public static void withdraw(double amount, BankAccount account) throws InsufficientFundsException {
        account.withdraw(amount);
    }

    public static void showBalance(BankAccount account){
        System.out.println(" Current Balance : "+account.getBalance());

    }
}
/*
*
*
*
            Main

            ↓

            TransactionUtil

            ↓

            BankAccount

            ↓

            Validation

            ↓

            Balance Updated
*
*
*
* */