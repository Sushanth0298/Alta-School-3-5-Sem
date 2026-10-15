package com.university.java.semester5.streamapi;

import java.util.Arrays;
import java.util.List;

public class ForEachDemo {

    public static void demonstrate() {

        List<String> names =
                Arrays.asList("Alice", "Bob", "Charlie");

        names.stream()
                .forEach(name ->
                        System.out.println("Hello " + name));
    }
}

/*
*
*   Output :
        Hello Alice
        Hello Bob
        Hello Charlie

        Main concept
        .forEach(...)

        is a terminal operation.
        It does not produce another Stream.
*
* */