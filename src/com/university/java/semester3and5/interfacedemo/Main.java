package com.university.java.semester3and5.interfacedemo;

public class Main {

    public static void main(String[] args) {

        System.out.println("===== CAR =====");

        Vehicle car = new Car();


        car.start();
        car.stop();

        System.out.println();

        System.out.println("===== BIKE =====");

        Bike bike = new Bike();

        bike.start();
        bike.stop();

    }

}
