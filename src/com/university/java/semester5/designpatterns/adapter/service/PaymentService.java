package com.university.java.semester5.designpatterns.adapter.service;

import com.university.java.semester5.designpatterns.adapter.adapter.PaymentProcessor;
import com.university.java.semester5.designpatterns.adapter.factory.PaymentFactory;
import com.university.java.semester5.designpatterns.adapter.model.PaymentRequest;

public class PaymentService {

    private final PaymentFactory factory = new PaymentFactory();

    public void processPayment(PaymentRequest request) {

        PaymentProcessor processor =
                factory.getInstance(request.getPaymentType());

        processor.pay(request.getAmount());
    }
}
