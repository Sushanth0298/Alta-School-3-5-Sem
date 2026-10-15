package com.university.java.semester3and5.JavaGenericsHandwrittenNotes;

import java.io.Serializable;

/**
 * Demonstrates the bound written in the notes:
 * T extends Animal & Serializable.
 *
 * When there is a class bound and interface bounds, the class bound comes first.
 */
public class AnimalPrinter<T extends Animal & Serializable> {
    private final T thingToPrint;

    public AnimalPrinter(T thingToPrint) {
        this.thingToPrint = thingToPrint;
    }

    public void print() {
        System.out.println(thingToPrint);
    }
}
