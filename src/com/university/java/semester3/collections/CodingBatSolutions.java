package com.university.java.semester3.collections;

import java.util.ArrayList;

public class CodingBatSolutions {

    public static void evenNumbers() {

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i <= 20; i++) {

            if (i % 2 == 0) {

                list.add(i);

            }

        }

        System.out.println(list);

    }

    public static void reverseString() {

        String str = "Java";

        for (int i = str.length() - 1; i >= 0; i--) {

            System.out.print(str.charAt(i));

        }

        System.out.println();

    }

    public static void sumArray() {

        int arr[] = {10,20,30,40};

        int sum = 0;

        for (int num : arr) {

            sum += num;

        }

        System.out.println(sum);

    }

}
