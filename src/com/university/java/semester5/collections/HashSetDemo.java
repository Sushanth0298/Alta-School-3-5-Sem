package com.university.java.semester5.collections;

import java.util.HashSet;

public class HashSetDemo {

    public static void demo() {

        HashSet<String> cities = new HashSet<>();

        cities.add("Bangalore");
        cities.add("Mysore");
        cities.add("Chennai");
        cities.add("Hyderabad");
        cities.add("Bangalore");

        System.out.println("HashSet Elements");

        for (String city : cities) {
            System.out.println(city);
        }
    }
}
