package com.skillspring.week2.mockito.voidmethods;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

class PaymentServiceTest {
    @Test
    void shouldMockVoidMethod() {
        AuditService auditService = mock(AuditService.class);
        doNothing().when(auditService).logAction("Paid amount: 2500.0");
        PaymentService paymentService = new PaymentService(auditService);
        assertEquals("Payment completed", paymentService.pay(2500));
        verify(auditService).logAction("Paid amount: 2500.0");
    }
}
