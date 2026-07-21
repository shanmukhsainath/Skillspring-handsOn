package com.skillspring.week2.mockito.matchers;

public interface DiscountRepository {
    int getDiscountPercentage(String customerType, double orderAmount);
}
