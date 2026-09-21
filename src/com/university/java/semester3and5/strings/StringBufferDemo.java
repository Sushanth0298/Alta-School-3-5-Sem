package com.university.java.semester3and5.strings;

public class StringBufferDemo {
    public static void main(String[] args) {

        StringBuffer sbuf = new StringBuffer("Hello");

        System.out.println("Before:");
        System.out.println("Value : " + sbuf);
        System.out.println("Identity : " + System.identityHashCode(sbuf));

        sbuf.append(" World");

        System.out.println("\nAfter:");
        System.out.println("Value : " + sbuf);
        System.out.println("Identity : " + System.identityHashCode(sbuf));
    }
}
