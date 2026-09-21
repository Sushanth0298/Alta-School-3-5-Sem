package com.university.java.semester5.abstraction;

public class UserMain {

    public static void main(String[] args) {

        User u1 = new Customer();
        User u2 = new Employee();

        u1.login();
        u1.logout();

        System.out.println();

        u2.login();
        u2.logout();
    }
}
