package com.university.java.semester3and5.inheritance.hierarchical;

public class Main {
    public static void main(String[] args) {
        Car c=new Car();

        Bike b=new Bike();

        c.start();

        c.drive();

        System.out.println();

        b.start();

        b.ride();


        System.out.println();

        Truck truck = new Truck();
        truck.start();
        truck.loadGoods();
    }
}
