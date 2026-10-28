package com.university.java.semester3and5.thread.creation;

class Downloader extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().getName());
        System.out.println("Downloading...");
    }
}

