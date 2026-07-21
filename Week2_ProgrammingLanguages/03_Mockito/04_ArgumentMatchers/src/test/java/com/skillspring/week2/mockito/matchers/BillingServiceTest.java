package com.skillspring.week2.mockito.matchers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyDouble;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class BillingServiceTest {
    @Test
    void shouldUseArgumentMatchersForDiscount() {
        DiscountRepository discountRepository = mock(DiscountRepository.class);
        when(discountRepository.getDiscountPercentage(eq("PREMIUM"), anyDouble())).thenReturn(20);
        BillingService billingService = new BillingService(discountRepository);
        assertEquals(800.0, billingService.calculateFinalAmount("PREMIUM", 1000.0));
    }
}
