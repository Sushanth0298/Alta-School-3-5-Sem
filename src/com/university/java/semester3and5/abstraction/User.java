package com.university.java.semester3and5.abstraction;

public abstract class User {

    public abstract void login();

    public void logout() {
        System.out.println("Logging Out...");
    }
}
