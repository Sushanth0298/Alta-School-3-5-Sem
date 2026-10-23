package com.university.java.semester3and5.thread;

import java.io.IOException;
import java.util.logging.FileHandler;

public class TryCatch {

        public static void main(String[] args)  throws IOException{

            //FileHandler fileHandler = new FileHandler("/uss/sushanth/Documents/Java.pdf");

            try {
                int x = 10/0;
                System.out.println("Hi");
                System.out.println("Hello");
                // close object
            } catch (ArithmeticException e) {
                System.out.println("Cannot divide by zero");
            } finally {
                // close object
                System.out.println("Always Runs");
            }
            System.out.println("Program continues");



        }
    public static void add() throws IOException {
        //
         //
         //
         //
         //
        FileHandler fileHandler = new FileHandler();

    }


    public static void checkCredential(int age){
        if (age < 18) {
            throw new IllegalArgumentException("Under 18");
        }
        System.out.println("Allowed");
    }
}
