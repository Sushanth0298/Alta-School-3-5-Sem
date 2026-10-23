package com.university.java.semester3and5.encapsulation.basic;

public class Main {

    public static void main(String[] args) {

//        Account account = new Account();
//
//        account.setBal(5000);
//
//        System.out.println(account.getBal());
//
//        account.setBal(50000);
//
//        System.out.println(account.getBal());




        Account a = new Account();

        Account account = new Account();
        account.setBal(10000);
        System.out.println(account.getBal());

        account.setBal(1);
        System.out.println(account.getBal());

    }

}