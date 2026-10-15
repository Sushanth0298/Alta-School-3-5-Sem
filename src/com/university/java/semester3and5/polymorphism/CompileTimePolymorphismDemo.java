package com.university.java.semester3and5.polymorphism;

public class CompileTimePolymorphismDemo {

    public static void main(String[] args) {

        MethodOverloadingDemo obj = new MethodOverloadingDemo();

        obj.display();
        obj.display("ABC");
        obj.display("Sushanth");
        obj.display(21, "Sushanth");
        obj.display();



        obj.display("String");

    }

}