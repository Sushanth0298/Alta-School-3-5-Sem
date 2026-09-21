package com.university.java.semester5.interfaceextended;

public class Car implements Vehicle, ElectricVehicle {

    @Override
    public void start() {
        System.out.println("Car starts");
    }

    @Override
    public void stop() {
        System.out.println("Car stops");
    }

    @Override
    public void charge() {
        System.out.println("Electric car is charging");
    }

}
