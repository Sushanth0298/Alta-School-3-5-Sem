package com.university.java.semester5.designpatterns.adapter.adapter;

import com.university.java.semester5.designpatterns.adapter.service.PayPalService;

public class PayPalAdapter implements PaymentProcessor {
    private PayPalService payPalService;

    public PayPalAdapter(PayPalService payPalService) {
        this.payPalService = payPalService;
    }

    @Override
    public void pay(int amount) {
        payPalService.makePayment(amount);
    }
}