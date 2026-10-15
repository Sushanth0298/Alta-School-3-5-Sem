package com.university.java.semester5.streamapi;

import java.util.Arrays;
import java.util.List;

public class StreamPipelineDemo {

    public static void demonstrate() {

        List<Integer> numbers =
                Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> result = numbers.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .toList();

        System.out.println("Result: " + result);
    }
}

/*
*
*   Output :
        Result: [4, 16, 36, 64, 100]

        Pipeline
        numbers
           ↓
        stream()
           ↓
        filter(even numbers)
           ↓
        map(square)
           ↓
        toList()
           ↓
        [4, 16, 36, 64, 100]
* */
