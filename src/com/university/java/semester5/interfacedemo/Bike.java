package com.university.java.semester5.interfacedemo;
public class Bike implements Vehicle {

    @Override
    public void start() {
        System.out.println("Bike starts using self-start or kick");
    }

    @Override
    public void stop() {
        System.out.println("Bike stops using brakes");
    }

    @Override
    public void fuelType() {
        System.out.println("Bike uses Petrol");
    }

}
