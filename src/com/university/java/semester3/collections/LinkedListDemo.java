package com.university.java.semester3.collections;

import java.util.LinkedList;

public class LinkedListDemo {

    public static void demo() {

        LinkedList<Employee> employees = new LinkedList<>();

        employees.add(new Employee(1, "John", "HR"));
        employees.add(new Employee(2, "David", "IT"));
        employees.add(new Employee(3, "Riya", "Finance"));

        System.out.println("LinkedList Elements");

        for (Employee e : employees) {
            System.out.println(e);
        }

        employees.addFirst(new Employee(100, "Manager", "Admin"));

        employees.addLast(new Employee(200, "CEO", "Management"));

        System.out.println();

        System.out.println("After addFirst() and addLast()");

        for (Employee e : employees) {
            System.out.println(e);
        }
    }
}
