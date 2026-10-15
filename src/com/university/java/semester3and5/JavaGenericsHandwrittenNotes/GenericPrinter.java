package com.university.java.semester3and5.JavaGenericsHandwrittenNotes;

/**
 * Generic version of the IntegerPrinter class from the handwritten notes.
 * T is a type parameter: the caller chooses the actual reference type.
 */
public class GenericPrinter<T> {
    private final T thingToPrint;

    public GenericPrinter(T thingToPrint) {
        this.thingToPrint = thingToPrint;
    }

    public void print() {
        System.out.println(thingToPrint);
    }
}
