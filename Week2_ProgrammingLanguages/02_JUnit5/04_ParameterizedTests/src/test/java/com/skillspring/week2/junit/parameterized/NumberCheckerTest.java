package com.skillspring.week2.junit.parameterized;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NumberCheckerTest {
    private final NumberChecker numberChecker = new NumberChecker();

    @ParameterizedTest
    @CsvSource({"2,true", "7,false", "10,true", "13,false"})
    void shouldCheckEvenNumbers(int number, boolean expectedResult) {
        assertEquals(expectedResult, numberChecker.isEven(number));
    }
}
