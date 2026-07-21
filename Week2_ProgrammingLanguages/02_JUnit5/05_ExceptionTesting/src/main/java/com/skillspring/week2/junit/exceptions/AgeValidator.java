package com.skillspring.week2.junit.exceptions;

public class AgeValidator {
    public boolean isEligibleToVote(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }
        return age >= 18;
    }
}
