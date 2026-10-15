package com.university.java.semester3and5.JavaGenericsHandwrittenNotes;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public final class CollectionExamples {
    private CollectionExamples() {
    }

    public static void run() {
        Set<String> cities = new HashSet<>();
        cities.add("Pune");
        cities.add("Bengaluru");
        cities.add("Pune"); // A Set stores unique values.
        System.out.println("HashSet: " + cities);

        Map<String, Integer> scores = new HashMap<>();
        scores.put("Asha", 90);
        scores.put("Ravi", 84);

        System.out.println("HashMap:");
        for (Map.Entry<String, Integer> entry : scores.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
