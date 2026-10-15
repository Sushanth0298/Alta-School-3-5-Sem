package com.university.java.semester3and5.has_a_relation;

class Account{

    long accNo;
    String type;
    double bal;
    int cid;

    public void deposit(double amount){
        bal = bal + amount;
    }

    public void withdraw(double amount){

        bal = bal - amount;
    }

    public void showBal(){
        System.out.println(bal);
    }

    public Account(){}

    public Account(long accNo, String type, double bal, int cid){

        this.accNo = accNo;
        this.type = type;
        this.bal = bal;
        this.cid = cid;

    }

}
