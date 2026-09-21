package com.university.java.semester3and5.constructors;

public class Student {
    String name;
    int age;
    String course;
    String electiveSubject;

    // Default constructor
    Student(){

    }
    Student(String name, int age, String course){
        this.name = name;
        this.age = age;
        this.course = course;
    }

//    Student(Student s){
//        this.name = s.name;
//        this.course = s.course;
//        this.age = s.age;
//
//    }


//    Student(Student s1){
//        this.name = s1.name;
//        this.age = s1.age;
//        this.course = s1.course;
//        this.electiveSubject = s1.electiveSubject;
//    }

    Student(Student s){
        this.name = s.name;
        this.age = s.age;
        this.course = s.course;
    }

    Student(String name, int age, String course, String electiveSubject){
        this.name = name;
        this.age = age;
        this.course = course;
        this.electiveSubject = electiveSubject;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", course='" + course + '\'' +
                ", electiveSubject='" + electiveSubject + '\'' +
                '}';
    }


//Default Constructor
//    public Student() {
//
//    }
//    public Student(String name, int age, String course){
//        this.name = name;
//        this.age = age;
//        this.course = course;
//
//    }
//
//    public Student(String name, int age, String course, String electiveSubject){
//        this.name = name;
//        this.age = age;
//        this.course = course;
//        this.electiveSubject = electiveSubject;
//    }
//
//    @Override
//    public String toString() {
//        return "Student{" +
//                "age=" + age +
//                ", name='" + name + '\'' +
//                ", course='" + course + '\'' +
//                ", electiveSubject='" + electiveSubject + '\'' +
//                '}';
//    }


    // Parameterized Constructor
//    public Student(String name, int age) {
//        System.out.println("Parameterized Constructor Called");
//        this.name = name;
//        this.age = age;
//        this.course = "Java";
//    }
//
//    // Constructor Overloading
//    public Student(String name, int age, String course) {
//        System.out.println("Overloaded Constructor Called");
//        this.name = name;
//        this.age = age;
//        this.course = course;
//    }
//
//    void display() {
//        System.out.println("Name   : " + name);
//        System.out.println("Age    : " + age);
//        System.out.println("Course : " + course);
//        System.out.println();
//    }
}
