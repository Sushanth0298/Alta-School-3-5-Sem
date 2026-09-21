package com.university.java.semester5.inheritance.multilevel;

public class Main {
    public static void main(String[] args) {
        Version1 version1 = new Version1();
        version1.version();;

        Version2 version2 = new Version2();
        version2.version();
        version2.version2();


        Version3 version3 = new Version3();
        version3.version();
        version3.version2();
        version3.version3();
    }
}
