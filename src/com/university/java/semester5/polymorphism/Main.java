package com.university.java.semester5.polymorphism;

public class Main {

    public static void main(String[] args) {

        System.out.println("========== COMPILE TIME POLYMORPHISM ==========");

        MethodOverloadingDemo obj = new MethodOverloadingDemo();

        obj.display();
        obj.display(18);
        obj.display("Sushanth");
        obj.display(18, "Sushanth");

        System.out.println();

        System.out.println("========== METHOD OVERRIDING ==========");

        SamsungOS samsung = new SamsungOS();
        samsung.showHomeScreen();

        OnePlusOS oneplus = new OnePlusOS();
        oneplus.showHomeScreen();

        MIOS mi = new MIOS();
        mi.showHomeScreen();

        System.out.println();

        System.out.println("========== RUNTIME POLYMORPHISM ==========");

        AndroidOS phone;

        phone = new SamsungOS();
        phone.showHomeScreen();

        phone = new OnePlusOS();
        phone.showHomeScreen();

        phone = new MIOS();
        phone.showHomeScreen();

    }

}
