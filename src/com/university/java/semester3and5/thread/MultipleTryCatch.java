package com.university.java.semester3and5.thread;

public class MultipleTryCatch {

    public static void main(String[] args) {
        try {
            String s = null;
            s.length();
        } catch (NullPointerException e) {
            System.out.println("Null found");
        } catch (Exception e) {
            System.out.println("Other problem");
        }
        checkAge(0);
    }

    static void checkAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Under 18");
        }
        System.out.println("Allowed");
    }
}
