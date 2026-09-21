package com.university.java.semester3and5.inheritance.animalexample;

public class Main {
    public static void main(String args[]){

       Animal a = new Animal();
       a.eat();
       a.sound();

       Dog d = new Dog();
       d.sound();
       d.eat();
       d.bark();

       Animal a1 = new Dog();
        System.out.println(" ****** ");
       a1.eat();

    }
}
