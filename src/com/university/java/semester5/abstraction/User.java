package com.university.java.semester5.abstraction;

public abstract class User {

    public abstract void login();

    public void logout() {
        System.out.println("Logging Out...");
    }
}
