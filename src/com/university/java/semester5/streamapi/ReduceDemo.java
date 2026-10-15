package com.university.java.semester5.streamapi;

import java.util.Arrays;
import java.util.List;

public class ReduceDemo {

    public static void demonstrate() {

        List<Integer> numbers =
                Arrays.asList(1, 2, 3, 4);

        int sum = numbers.stream()
                .reduce(0, Integer::sum);

        System.out.println("Sum: " + sum);


        int maximum = numbers.stream()
                .reduce(Integer.MIN_VALUE, Integer::max);

        System.out.println("Maximum using reduce: " + maximum);
    }
}


/*
*       Output
            Sum: 10
            Maximum using reduce: 4

            Main concept
            For:
            .reduce(0, Integer::sum)

            the operation is conceptually:
            0 + 1 = 1
            1 + 2 = 3
            3 + 3 = 6
            6 + 4 = 10

            So the final result is:
            10
*
* */
