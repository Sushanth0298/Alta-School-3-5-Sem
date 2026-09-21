package com.university.java.semester5.collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

    public static void demo() {

        HashMap<Integer, String> students = new HashMap<>();

        students.put(101, "Rahul");
        students.put(102, "Sneha");
        students.put(103, "Amit");

        System.out.println("HashMap");

        for (Map.Entry<Integer, String> entry : students.entrySet()) {

            System.out.println(entry.getKey() + " : " + entry.getValue());

        }
    }
}
