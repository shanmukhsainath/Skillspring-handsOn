package com.skillspring.week2.junit.order;

public class OrderProcessor {
    private boolean orderCreated;
    private boolean paymentDone;

    public void createOrder() {
        orderCreated = true;
    }

    public void makePayment() {
        if (!orderCreated) {
            throw new IllegalStateException("Create order before payment");
        }
        paymentDone = true;
    }

    public String shipOrder() {
        if (!paymentDone) {
            throw new IllegalStateException("Payment is required before shipping");
        }
        return "Order shipped";
    }
}
