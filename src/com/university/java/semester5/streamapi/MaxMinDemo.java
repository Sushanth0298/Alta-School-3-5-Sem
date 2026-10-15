package com.university.java.semester5.streamapi;

import java.util.Arrays;
import java.util.List;

public class MaxMinDemo {

    public static void demonstrate() {

        List<Integer> numbers =
                Arrays.asList(1, 25, 6, 3, 6, 7, 899, 39);

        int max = numbers.stream()
                .max(Integer::compareTo)
                .orElseThrow();

        int min = numbers.stream()
                .min(Integer::compareTo)
                .orElseThrow();

        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
    }
}
