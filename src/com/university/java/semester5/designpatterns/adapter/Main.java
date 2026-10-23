package com.university.java.semester5.designpatterns.adapter;

import com.university.java.semester5.designpatterns.adapter.adapter.PaymentProcessor;
import com.university.java.semester5.designpatterns.adapter.controller.PaymentController;
import com.university.java.semester5.designpatterns.adapter.factory.PaymentFactory;
import com.university.java.semester5.designpatterns.adapter.model.PaymentType;

public class Main {
    public static void main(String[] args) {
        PaymentFactory factory = new PaymentFactory();
        PaymentController controller = new PaymentController();

        PaymentProcessor paypal =
                factory.getInstance(PaymentType.PAYPAL);

        PaymentProcessor phonepe =
                factory.getInstance(PaymentType.PHONEPE);

        controller.makePayment(paypal, 500);
        controller.makePayment(phonepe, 1000);
    }
}
