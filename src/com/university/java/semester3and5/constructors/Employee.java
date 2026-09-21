package com.university.java.semester3and5.constructors;

public class Employee {

    int id;
    String name;
    double salary;






    public Employee() {

    }

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void display(){
        System.out.println(id);
        System.out.println(name);
        System.out.println(salary);
    }
}
