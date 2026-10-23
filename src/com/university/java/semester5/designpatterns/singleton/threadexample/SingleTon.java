package com.university.java.semester5.designpatterns.singleton.threadexample;

import java.util.concurrent.atomic.AtomicInteger;

class SingleTon {
    private static SingleTon instance;
    private static final AtomicInteger created = new AtomicInteger();
    private SingleTon() {
        created.incrementAndGet();
    }
    static int createdCount() {
        return created.get();
    }
    public static SingleTon getInstance() {
        if (instance == null) {
            pause();                                   // demo only: widens the race window
            instance = new SingleTon();
        }
        return instance;
    }
    private static void pause() {
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
