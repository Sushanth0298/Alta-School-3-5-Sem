package com.university.java.semester5.designpatterns.adapter.controller;

import com.university.java.semester5.designpatterns.adapter.adapter.PaymentProcessor;

public class PaymentController {
    public void makePayment(PaymentProcessor processor, int amount) {
        processor.pay(amount);
    }
}
