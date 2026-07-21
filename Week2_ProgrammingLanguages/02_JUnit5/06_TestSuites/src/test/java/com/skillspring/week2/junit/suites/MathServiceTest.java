package com.skillspring.week2.junit.suites;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MathServiceTest {
    @Test
    void shouldReturnSquare() {
        MathService mathService = new MathService();
        assertEquals(25, mathService.square(5));
    }
}
