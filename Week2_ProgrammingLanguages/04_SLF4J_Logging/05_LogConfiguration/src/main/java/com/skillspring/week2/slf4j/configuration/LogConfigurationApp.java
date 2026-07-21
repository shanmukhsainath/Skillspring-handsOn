package com.skillspring.week2.slf4j.configuration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogConfigurationApp {
    private static final Logger logger = LoggerFactory.getLogger(LogConfigurationApp.class);

    public static void main(String[] args) {
        logger.trace("Trace message for detailed debugging");
        logger.debug("Debug message for developers");
        logger.info("Info message from configured logger");
        logger.warn("Warning message from configured logger");
        logger.error("Error message from configured logger");
    }
}
