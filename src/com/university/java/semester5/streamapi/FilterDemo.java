package com.university.java.semester5.streamapi;

import java.util.Arrays;
import java.util.List;

public class FilterDemo {

    public static void demonstrate() {

        List<Integer> numbers =
                Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .toList();

        System.out.println("Even numbers: " + evenNumbers);
    }
}


/*
*
*           Even numbers: [2, 4, 6, 8]
*           Only elements satisfying the condition are retained :  .filter(n -> n % 2 == 0)
*
*
* */
