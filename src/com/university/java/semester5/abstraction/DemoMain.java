package com.university.java.semester5.abstraction;

public class DemoMain {

    public static void main(String[] args) {

        Demo d1 = new Sample();

        System.out.println(d1.z1);

        d1.count();

        d1.test();

        Sample s1 = new Sample();

        s1.display();
    }
}
