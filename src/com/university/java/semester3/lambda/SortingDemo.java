package com.university.java.semester3.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortingDemo {

    public static void demonstrateSorting() {

        List<Integer> numbers = new ArrayList<>(
                Arrays.asList(40, 10, 30, 20, 50)
        );

        System.out.println("Before sorting: " + numbers);

        numbers.sort((a, b) -> a - b);

        System.out.println("Ascending order: " + numbers);

        numbers.sort((a, b) -> b - a);

        System.out.println("Descending order: " + numbers);
    }
}