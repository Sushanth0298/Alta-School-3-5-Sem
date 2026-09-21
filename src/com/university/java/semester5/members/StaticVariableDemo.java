package com.university.java.semester5.members;

public class StaticVariableDemo {
    public static void main(String[] args){

        Student s1 = new Student("Rahul",20);
        Student s2 = new Student("Priya",21);

        System.out.println(Student.college);

        s1.college = "SIT";

        //System.out.println("****");
        Calculator calculator = new Calculator();


        System.out.println(Student.college);
        System.out.println(s2.college);

    }
}
