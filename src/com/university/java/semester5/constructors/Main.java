package com.university.java.semester5.constructors;

public class Main {

    public static void main(String[] args) {







        Student s1 = new Student("RAHUL", 18, "JAVA");
        System.out.println(s1.toString());

        Student s4 = new Student(s1);
        s4.age = 19;

        System.out.println(s4.toString());



        //
//
//
//
//        Student s2 = new Student("PRIYA", 18 , "JAVA");
//
//        Student s4 = new Student(s1);
//        s4.name = "RAGHU";

//        Student s4 = new Student(s1);
//        s4.course = "C++";



//        System.out.println(s1.toString());
//        System.out.println(s4.toString());

//        System.out.println(s4.toString());
//        Student s3 = new Student("RAGHU",20,"JAVA","C++");
//
       // System.out.println(s3.toString());

//        System.out.println(s1);
//        System.out.println(s2);
//        System.out.println(s3);


























//
//        System.out.println("----- Student -----");
//
//        Student s1 = new Student("Rahul", 19);
//
//        Student s3 = new Student("Priya", 3,"AI/ML");
//        s3.display();
//
//
//
//        Student s2 = new Student("Sushanth", 21);
////
////        Student s3 = new Student("Anjali", 20, "Computer Science");
//
//        s1.display();
//        s2.display();
////        s3.display();

//        System.out.println("----- Employee -----");
//
//        Employee e1 = new Employee();
//
//        Employee e2 = new Employee(101, "John", 65000);
//        Employee e3 = new Employee(102, "Ajay", 65000);

        //e1.display();
//        e2.display();
//        e3.display();
//
//        System.out.println("----- Product -----");

//        Product p = new Product();
//
//        p.display();
//
//        Student s1 = new Student("Rahul", 17 , "JAVA");
//        //System.out.println(s1.toString());
//            System.out.println(s1.toString());
//
//        Student s2 = new Student("Priya", 17, "JAVA");
//        //System.out.println(s2.toString());
//            System.out.println(s2.toString());
//
//        Student s3 = new Student("Dev", 18, "JAVA", "Electronicc");
//            System.out.println(s3.toString());
//
//
//
//
//
//        Employee e1 = new Employee(120, "Sushanth",10.0);
//        //e1.display();
//            System.out.println(e1);
//        System.out.println("**************");
//        Employee e2 = new Employee(230, "Dev", 10.0);
//        //e2.display();
//            System.out.println(e2);




    }
}