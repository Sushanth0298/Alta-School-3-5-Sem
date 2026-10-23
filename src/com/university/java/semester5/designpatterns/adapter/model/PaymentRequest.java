package com.university.java.semester5.designpatterns.adapter.model;

public class PaymentRequest {

    private int amount;
    private PaymentType paymentType;

    public PaymentRequest(int amount, PaymentType paymentType) {
        this.amount = amount;
        this.paymentType = paymentType;
    }

    public int getAmount() {
        return amount;
    }

    public PaymentType getPaymentType() {
        return paymentType;
    }
}