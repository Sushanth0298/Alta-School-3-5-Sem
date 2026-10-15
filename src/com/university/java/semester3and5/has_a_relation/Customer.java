package com.university.java.semester3and5.has_a_relation;

class Customer{

    int cid;
    String pwd;
    Account a1;

    public Customer(int cid, String pwd){
        this.cid = cid;
        this.pwd = pwd;
        a1 = new Account();

    }

    public void depositToAccount(double amt){
        a1.deposit(amt);

    }

    public void withdrawFromAccount(double amt){

        a1.withdraw(amt);

    }
    public void displayFromAccount(){

        a1.showBal();

    }



}

