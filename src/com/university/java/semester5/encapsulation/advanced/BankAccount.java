package com.university.java.semester5.encapsulation.advanced;

public class BankAccount {
    private final String accountNo;
    private final String owner;
    private double balance;

    public String getAccountNo() {
        return accountNo;
    }

    public String getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }

    public BankAccount(String accountNo, String owner, double initalBalance){
        this.accountNo = accountNo;
        this.owner = owner;

        if(initalBalance < 0) throw new IllegalArgumentException("Initial balance cannot be negative");

        this.balance = initalBalance;
    }

    public void deposit(double amount){
        if(amount<=0) throw new IllegalArgumentException("Deposit amount must be positive");
        balance += amount;
    }
    public void withdraw(double amount) throws InsufficientFundsException {
        if(amount<=0) throw new IllegalArgumentException("withdraw amount must be positive ");

        if(amount > balance) throw new InsufficientFundsException("Insufficient Funds");
        balance -= amount;
    }

    @Override
    public String toString(){
        return String.format("Bank Account %s, owner=%s, balance=%.2f ",accountNo,owner,balance);
    }


}


/*
*
*
        BankAccount

        This is called Domain Class, It represents one account.
*
*
* */
