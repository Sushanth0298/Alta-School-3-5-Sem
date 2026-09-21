package com.university.java.semester3and5.polymorphism;

public class MethodOverloadingDemo {


    public void display() {
        System.out.println("Display Method");
        System.out.println(1);
        System.out.println(12.0);
        System.out.println("STRING");
    }

    public void display(int age) {
        System.out.println("Age : " + age);
    }

    public void display(String name) {
        System.out.println("Name : " + name);
    }

    public void display(int age, String name) {
        System.out.println(name + " " + age);
    }
}