package com.university.java.semester3and5.thread;

import java.io.IOException;
import java.util.logging.FileHandler;

public class Main {
    public static void main(String[] args) throws IOException {
        //int a = 10/0;

       // FileHandler fileHandler = new FileHandler("");
        Thread t = Thread.currentThread();
        System.out.println(t.getName());
        System.out.println(t.getPriority());


        System.out.println(t.getPriority());

        System.out.println("Start");
        try{
            // read a file
            int x = 10 / 0;
            System.out.println("kill");
            System.out.println("close");
            // close the file
        }catch (ArithmeticException e){
            System.out.println("ArithmeticException Exception is handled");
        } finally {
            System.out.println("Closing the file");
            System.out.println("kill from finally");
            System.out.println("close from finally");
            System.out.println("This block of code always runs");
        }
        System.out.println("End");


    }

    public static void add() throws IOException {
            FileHandler fileHandler = new FileHandler("/usr/sushanth/Java.pdf");
    }
}