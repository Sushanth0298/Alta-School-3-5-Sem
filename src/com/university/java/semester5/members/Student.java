package com.university.java.semester5.members;

public class Student {
    String name;
    int age;

    static String college = "ADYPU";

    Student(){}

    Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void display(){
        System.out.println(name + " " + age);
    }

    static void collegeInfo(){
        System.out.println(college);
    }



}
