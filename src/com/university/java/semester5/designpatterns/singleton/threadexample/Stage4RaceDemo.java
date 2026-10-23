package com.university.java.semester5.designpatterns.singleton.threadexample;

public class Stage4RaceDemo {
    public static void main(String[] args) throws InterruptedException {
        final SingleTon[] seen = new SingleTon[2];
        Thread t1 = new Thread(() -> seen[0] = SingleTon.getInstance());
        Thread t2 = new Thread(() -> seen[1] = SingleTon.getInstance());
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("Objects created: " + SingleTon.createdCount());
        System.out.println("Same object  = ? " + (seen[0] == seen[1]));
    }
}
