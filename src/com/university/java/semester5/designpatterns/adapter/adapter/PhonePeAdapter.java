package com.university.java.semester5.designpatterns.adapter.adapter;

import com.university.java.semester5.designpatterns.adapter.service.PhonePeService;

public class PhonePeAdapter implements PaymentProcessor {
    private PhonePeService phonePeService;

    public PhonePeAdapter(PhonePeService phonePeService) {
        this.phonePeService = phonePeService;
    }

    @Override
    public void pay(int amount) {
        phonePeService.doPayment(amount, "CLIENT123");
    }
}