package com.university.java.semester3and5.thread.creation;

public class Main {
    public static void main(String[] args) {
        Downloader d = new Downloader();
        d.run();
        d.start();
        System.out.println("Main continues");
    }
}
