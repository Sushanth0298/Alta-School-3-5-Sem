package com.university.java.semester3.interfaceextended;

public class Main {

    public static void main(String[] args) {

        System.out.println("===== CAR =====");

        Car car = new Car();

        car.start();
        car.stop();
        car.charge();

        System.out.println();

        System.out.println("===== BIKE =====");

        Bike bike = new Bike();

        bike.start();
        bike.stop();

    }

}
