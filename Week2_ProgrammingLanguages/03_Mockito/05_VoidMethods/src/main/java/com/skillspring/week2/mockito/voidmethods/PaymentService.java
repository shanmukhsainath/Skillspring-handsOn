package com.skillspring.week2.mockito.voidmethods;

public class PaymentService {
    private final AuditService auditService;

    public PaymentService(AuditService auditService) {
        this.auditService = auditService;
    }

    public String pay(double amount) {
        auditService.logAction("Paid amount: " + amount);
        return "Payment completed";
    }
}
