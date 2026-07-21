package com.skillspring.week2.slf4j.exceptions;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogExceptionsApp {
    private static final Logger logger = LoggerFactory.getLogger(LogExceptionsApp.class);

    public static void main(String[] args) {
        try {
            int result = divide(10, 0);
            logger.info("Result is {}", result);
        } catch (ArithmeticException exception) {
            logger.error("Calculation failed", exception);
        }
    }

    private static int divide(int firstNumber, int secondNumber) {
        return firstNumber / secondNumber;
    }
}
