package com.university.java.semester5.members;

public class NonStaticVariableDemo {

    int s = 10;

    public static void main(String[] args){

        Student s1 = new Student("Rahul",20);
        Student s2 = new Student("Priya",21);

        System.out.println(s1);
        System.out.println(s2);

//        s1.age = 30;
//
//        System.out.println(s1.age);
//
//        System.out.println(s2.age);

    }
}
