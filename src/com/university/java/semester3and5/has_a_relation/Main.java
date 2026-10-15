package com.university.java.semester3and5.has_a_relation;

class Main{

    public static void main(String[] args) {

        Customer c1= new Customer(1234, "pwd1");
        c1.depositToAccount(2000);
        System.out.print("C1 : Amount before withdrawal : ");
        c1.displayFromAccount();
        System.out.print("C1 : Amount after withdrawal : ");
        c1.withdrawFromAccount(1000);
        c1.displayFromAccount();

        System.out.println(" ************** ");
        Customer c2= new Customer(4567, "pwd2");
        c2.depositToAccount(4000);
        System.out.print("C2 : Amount before withdrawal : ");
        c2.displayFromAccount();
        System.out.print("C2 : Amount after withdrawal : ");
        c2.withdrawFromAccount(1000);
        c2.displayFromAccount();


    }

}
