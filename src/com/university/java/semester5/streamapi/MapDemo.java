package com.university.java.semester5.streamapi;

import java.util.Arrays;
import java.util.List;

public class MapDemo {

    public static void demonstrate() {

        List<String> fruits =
                Arrays.asList("apple", "mango", "banana", "orange");

        List<String> upperCaseFruits = fruits.stream()
                .map(String::toUpperCase)
                .toList();

        System.out.println("Uppercase fruits: " + upperCaseFruits);


        List<Integer> numbers =
                Arrays.asList(1, 2, 3, 4, 5);

        List<Integer> squares = numbers.stream()
                .map(n -> n * n)
                .toList();

        System.out.println("Squares: " + squares);
    }
}


/*
*
      Uppercase fruits: [APPLE, MANGO, BANANA, ORANGE]

        Squares: [1, 4, 9, 16, 25]
         .map(n -> n * n)
         Every element is transformed.
            1 → 1
            2 → 4
            3 → 9
            4 → 16
            5 → 25

*
*
*
* */
