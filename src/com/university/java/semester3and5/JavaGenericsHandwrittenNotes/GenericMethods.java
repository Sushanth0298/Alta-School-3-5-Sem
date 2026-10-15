package com.university.java.semester3and5.JavaGenericsHandwrittenNotes;

import java.util.List;

public final class GenericMethods {
    private GenericMethods() {
    }

    // Corresponds to the handwritten shout(T thingToShout) method.
    public static <T> void shout(T thingToShout) {
        System.out.println(thingToShout + "!!!");
    }

    // Corresponds to the handwritten shout(T, V) idea.
    public static <T, V> void shoutTwo(T first, V second) {
        System.out.println(first + " " + second + "!!!");
    }

    // Wildcard example: accepts a list whose element type is not known here.
    public static void printList(List<?> myList) {
        for (Object item : myList) {
            System.out.println(item);
        }
    }

    // Bounded generic method: accepts Animal and its subclasses.
    public static <T extends Animal> void introduce(T animal) {
        System.out.println("Meet " + animal.getName());
    }
}
