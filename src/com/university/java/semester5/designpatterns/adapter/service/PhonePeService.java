package com.university.java.semester5.designpatterns.adapter.service;

public class PhonePeService {
    public void doPayment(double amount, String clientId) {
        System.out.println(
                "Payment done via PhonePe: " + amount
                        + ", Client: " + clientId
        );
    }
}