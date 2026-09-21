package com.university.java.semester3.collections;

import java.util.ArrayList;

public class ArrayListDemo {

    public static void demo() {

        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student(101, "Rahul", 85));
        students.add(new Student(102, "Sneha", 92));
        students.add(new Student(103, "Amit", 78));


        System.out.println("ArrayList Elements");

        for (Student s : students) {
            System.out.println(s);
        }

        System.out.println();

        students.remove(1);

        System.out.println("After Removing");

        for (Student s : students) {
            System.out.println(s);
        }
    }
}
