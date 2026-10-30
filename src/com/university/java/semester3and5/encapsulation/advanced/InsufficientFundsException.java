package com.university.java.semester3and5.encapsulation.advanced;

import java.util.concurrent.Callable;

public class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message){
        super(message);
        System.out.println();
    }
}
