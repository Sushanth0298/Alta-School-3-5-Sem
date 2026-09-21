package com.university.java.semester3and5.interfacedemo;

public class Car implements Vehicle {

    @Override
    public void start() {
        System.out.println("Car starts using a key or push button");
    }

    @Override
    public void stop() {
        System.out.println("Car stops using brakes");
    }
    @Override
    public void fuelType() {
        System.out.println("Car uses Petrol or Diesel");
    }


}
