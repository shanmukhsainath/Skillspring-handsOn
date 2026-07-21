package com.skillspring.week2.slf4j.parameterized;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ParameterizedLoggingApp {
    private static final Logger logger = LoggerFactory.getLogger(ParameterizedLoggingApp.class);

    public static void main(String[] args) {
        String studentName = "Meera";
        int completedExercises = 15;
        logger.info("Student {} completed {} exercises", studentName, completedExercises);
    }
}
