package com.university.java.semester5.encapsulation.advanced;

public class Main {
    public static void main(String[] args) {

        try {

            BankAccount account = new BankAccount(
                            "ACC101",
                            "Sushanth",
                            10000);

            System.out.println(account);

            TransactionUtil.deposit(2500, account);

            TransactionUtil.showBalance(account);

            TransactionUtil.withdraw(3000, account);

            TransactionUtil.showBalance(account);

            TransactionUtil.withdraw(15000, account);

        }

        catch (InsufficientFundsException e){

            System.out.println(e.getMessage());

        }

        catch (IllegalArgumentException e){

            System.out.println(e.getMessage());

        }

    }
}


/*
*
*
*
*
*   Real Banking Flow

                Customer

                ↓

                Deposit ₹1000

                ↓

                Cashier

                ↓

                Bank Software

                ↓

                Validate

                ↓

                Database

                ↓

                Updated Balance
* */
