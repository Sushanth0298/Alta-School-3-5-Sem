package com.university.java.semester5.collections;

public class Employee {

    private int id;
    private String name;
    private String department;

    public Employee(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee [ID=" + id +
                ", Name=" + name +
                ", Department=" + department + "]";
    }
}
