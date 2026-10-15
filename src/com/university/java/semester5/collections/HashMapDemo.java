package com.university.java.semester5.collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

    public static void demo() {

        HashMap<Integer, Student> students = new HashMap<>();
        students.put(101, new Student(101, "RAHUL",90));

        HashMap<Integer, String> demo = new HashMap<>();
        demo.put(102, "Sneha");
        demo.put(103, "Amit");

        System.out.println("HashMap");


        for(Map.Entry<Integer, String> e : demo.entrySet()){
            System.out.println( e.getKey());
        }


        for (Map.Entry<Integer, Student> entry : students.entrySet()) {

            System.out.println(entry.getKey() + " : " + entry.getValue());

        }
    }
}
