package com.university.java.semester5.inheritance.animalexample;

public class Dog extends Animal{

    int age=5;


//    Dog(){
//
//        super();
//
//        System.out.println("Dog Constructor");
//
//    }
//
//    void display(){
//        super.sound();
//
//        System.out.println(super.age);
//
//    }
//    void sound(){
//
//        System.out.println("Dog");
//
//    }
//

//    @Override
//    public void eat()
//    {
//        System.out.println("Dog is eating");
//    }
    public void bark(){
        System.out.println("Dog Barking");
    }


    public void eat(){
        System.out.println("DOG IS EATING");
    }


    public void sound(){
        System.out.println("THIS IS DOG SOUND");
    }
}
