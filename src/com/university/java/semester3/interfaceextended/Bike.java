package com.university.java.semester3.interfaceextended;


public class Bike implements Vehicle {



    @Override
    public void start() {
        System.out.println("Bike starts");
    }

    @Override
    public void stop() {
        System.out.println("Bike stops");
    }

}
