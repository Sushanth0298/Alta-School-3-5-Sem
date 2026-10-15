package com.university.java.semester3and5.JavaGenericsHandwrittenNotes;

/**
 * The original non-generic idea from the notes.
 * This class can store only an Integer.
 */
public class IntegerPrinter {
    private final Integer thingToPrint;

    public IntegerPrinter(Integer thingToPrint) {
        this.thingToPrint = thingToPrint;
    }

    public void print() {
        System.out.println(thingToPrint);
    }
}
