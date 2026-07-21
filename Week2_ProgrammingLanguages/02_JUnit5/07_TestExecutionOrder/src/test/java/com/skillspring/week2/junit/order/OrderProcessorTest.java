package com.skillspring.week2.junit.order;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class OrderProcessorTest {
    private final OrderProcessor orderProcessor = new OrderProcessor();

    @Test
    @Order(1)
    void shouldCreateOrderFirst() {
        orderProcessor.createOrder();
    }

    @Test
    @Order(2)
    void shouldMakePaymentSecond() {
        orderProcessor.makePayment();
    }

    @Test
    @Order(3)
    void shouldShipOrderThird() {
        assertEquals("Order shipped", orderProcessor.shipOrder());
    }
}
