package com.university.java.semester5.polymorphism;

public class RuntimePolymorphismDemo {

    public static void main(String[] args) {

        AndroidOS os;

        os = new SamsungOS();
        os.showHomeScreen();

        os = new OnePlusOS();
        os.showHomeScreen();

        os = new MIOS();
        os.showHomeScreen();

    }

}