package com.university.java.semester5.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalDemo {

    public static void demonstrate() {

        List<Integer> numbers =
                Arrays.asList(10, 20, 30, 40);

        Optional<Integer> result = numbers.stream()
                .max(Integer::compareTo);

        System.out.println("Maximum: " + result.orElseThrow());


        System.out.println("Using orElse: "
                + result.orElse(-1));


        result.ifPresent(value ->
                System.out.println("Value exists: " + value));
    }
}


/*
*
*   Output :
        Maximum: 40
        Using orElse: 40
        Value exists: 40

        Main methods demonstrated
        result.orElseThrow()

        result.orElse(-1)

        result.ifPresent(...)
* */
