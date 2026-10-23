package com.university.java.semester5.designpatterns.adapter.service;

public class PayPalService {
    public void makePayment(double value) {
        System.out.println("Payment done via PayPal: " + value);
    }
}