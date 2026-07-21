package com.skillspring.week2.mockito.matchers;

public class BillingService {
    private final DiscountRepository discountRepository;

    public BillingService(DiscountRepository discountRepository) {
        this.discountRepository = discountRepository;
    }

    public double calculateFinalAmount(String customerType, double orderAmount) {
        int discount = discountRepository.getDiscountPercentage(customerType, orderAmount);
        return orderAmount - (orderAmount * discount / 100);
    }
}
