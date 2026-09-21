package com.university.java.semester5.polymorphism;

public class MethodOverridingDemo {

    public static void main(String[] args) {

        SamsungOS samsung = new SamsungOS();
        samsung.showHomeScreen();

        OnePlusOS oneplus = new OnePlusOS();
        oneplus.showHomeScreen();

        MIOS mi = new MIOS();
        mi.showHomeScreen();
        

    }

}
