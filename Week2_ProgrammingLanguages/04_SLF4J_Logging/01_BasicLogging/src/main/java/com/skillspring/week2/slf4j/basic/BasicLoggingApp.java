package com.skillspring.week2.slf4j.basic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BasicLoggingApp {
    private static final Logger logger = LoggerFactory.getLogger(BasicLoggingApp.class);

    public static void main(String[] args) {
        logger.info("Application started");
        logger.info("Basic logging example completed");
    }
}
