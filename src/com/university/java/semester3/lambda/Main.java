package com.university.java.semester3.lambda;


public class Main {

    public static void main(String[] args) {

        System.out.println("===== CALCULATOR LAMBDA =====");

        Calculator addition = (a, b) -> a + b;
        Calculator subtraction = (a, b) -> a - b;
        Calculator multiplication = (a, b) -> a * b;

        System.out.println("Addition: "
                + addition.calculate(10, 5));

        System.out.println("Subtraction: "
                + subtraction.calculate(10, 5));

        System.out.println("Multiplication: "
                + multiplication.calculate(10, 5));


        System.out.println();

        System.out.println("===== GREETING LAMBDA =====");

        Greeting greeting = name ->
                System.out.println("Hello, " + name);

        greeting.greet("Sushanth");


        System.out.println();

        System.out.println("===== SORTING DEMO =====");

        SortingDemo.demonstrateSorting();
    }
}
