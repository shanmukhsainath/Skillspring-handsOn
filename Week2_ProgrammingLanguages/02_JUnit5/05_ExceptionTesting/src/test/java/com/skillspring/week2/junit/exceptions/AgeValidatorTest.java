package com.skillspring.week2.junit.exceptions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

class AgeValidatorTest {
    private final AgeValidator ageValidator = new AgeValidator();

    @Test
    void shouldAllowAdultVoter() {
        assertTrue(ageValidator.isEligibleToVote(21));
    }

    @Test
    void shouldRejectMinorVoter() {
        assertFalse(ageValidator.isEligibleToVote(15));
    }

    @Test
    void shouldThrowExceptionForNegativeAge() {
        assertThrows(IllegalArgumentException.class, () -> ageValidator.isEligibleToVote(-5));
    }
}
