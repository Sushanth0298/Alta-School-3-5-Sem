package com.university.java.semester5.abstraction;

public class Employee extends User {

    @Override
    public void login() {
        System.out.println("Employee Login Successful");
    }
}