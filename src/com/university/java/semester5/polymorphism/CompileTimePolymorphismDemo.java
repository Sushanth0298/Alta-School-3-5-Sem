package com.university.java.semester5.polymorphism;

public class CompileTimePolymorphismDemo {

    public static void main(String[] args) {

        MethodOverloadingDemo obj = new MethodOverloadingDemo();

        obj.display();
        obj.display(21);
        obj.display("Sushanth");
        obj.display(21, "Sushanth");
        obj.display();

    }

}