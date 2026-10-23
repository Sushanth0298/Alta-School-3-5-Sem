package com.university.java.semester5.designpatterns.adapter.factory;

import com.university.java.semester5.designpatterns.adapter.adapter.PayPalAdapter;
import com.university.java.semester5.designpatterns.adapter.adapter.PaymentProcessor;
import com.university.java.semester5.designpatterns.adapter.adapter.PhonePeAdapter;
import com.university.java.semester5.designpatterns.adapter.service.PayPalService;
import com.university.java.semester5.designpatterns.adapter.service.PhonePeService;
import com.university.java.semester5.designpatterns.adapter.model.PaymentType;

public class PaymentFactory {
    public PaymentProcessor getInstance(PaymentType type) {
        if (type == PaymentType.PAYPAL) {
            return new PayPalAdapter(new PayPalService());
        } else if (type == PaymentType.PHONEPE) {
            return new PhonePeAdapter(new PhonePeService());
        }

        throw new IllegalArgumentException("Unsupported payment type");
    }
}