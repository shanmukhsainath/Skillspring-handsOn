package com.skillspring.week2.slf4j.levels;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogLevelsApp {
    private static final Logger logger = LoggerFactory.getLogger(LogLevelsApp.class);

    public static void main(String[] args) {
        logger.info("Student profile loaded");
        logger.warn("Attendance percentage is below expected limit");
        logger.error("Unable to generate report because marks are missing");
    }
}
