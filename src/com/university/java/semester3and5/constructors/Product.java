package com.university.java.semester3and5.constructors;

public class Product {

    int id;
    String name;
    double price;

    public Product() {
        this(101);
        System.out.println("Default Constructor");
    }

    public Product(int id) {
        this(id, "Keyboard");
        System.out.println("One Parameter Constructor");
    }

    public Product(int id, String name) {
        this(id, name, 1200);
        System.out.println("Two Parameter Constructor");
    }

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;

        System.out.println("Three Parameter Constructor");
    }

    void display() {
        System.out.println(id);
        System.out.println(name);
        System.out.println(price);
    }
}