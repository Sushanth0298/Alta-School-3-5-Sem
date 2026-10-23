package com.university.java.semester5.designpatterns.singleton;

public class Main {
    public static void main(String[] args) {

        Singleton s1 =
                Singleton.getInstance();

        Singleton s2 =
                Singleton.getInstance();

        System.out.println(s1 == s2);
    }
}
