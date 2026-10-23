package com.university.java.semester5.designpatterns.singleton;

public class Singleton {

    private static volatile Singleton instance;

    private Singleton() {
        System.out.println("Object created");
    }

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }

        return instance;
    }
}
