package com.university.java.semester3and5.strings;

public class StringBuilderDemo {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Hello");

        System.out.println("Before:");
        System.out.println("Value : " + sb);
        System.out.println("Identity : " + System.identityHashCode(sb));

        sb.append(" World");

        System.out.println("\nAfter:");
        System.out.println("Value : " + sb);
        System.out.println("Identity : " + System.identityHashCode(sb));
    }
}
