package com.university.java.semester5.strings;

public class StringDemo {
    public static void main(String[] args) {

        String s = "Hello";
//        String s1 = new String("Hello");

        System.out.println("Before:");
        System.out.println("Value : " + s);
        System.out.println("Identity : " + System.identityHashCode(s));

        String s1 = "Hello";
//        String s3 = "Hello";

//        System.out.println("Value : " + s2);
//        System.out.println("Identity : " + System.identityHashCode(s2));

        ///s = s + " World";

        System.out.println("\nAfter:");
        System.out.println("Value : " + s1);
        System.out.println("Identity : " + System.identityHashCode(s1));
    }
}
