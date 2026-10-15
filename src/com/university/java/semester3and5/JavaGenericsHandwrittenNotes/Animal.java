package com.university.java.semester3and5.JavaGenericsHandwrittenNotes;

import java.io.Serializable;

public abstract class Animal implements Serializable {
    private static final long serialVersionUID = 1L;

    private final String name;

    protected Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" + name + ")";
    }
}
