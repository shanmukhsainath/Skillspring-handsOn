package com.skillspring.week2.junit.timeout;

public class ReportGenerator {
    public String generateReport() throws InterruptedException {
        Thread.sleep(100);
        return "Report generated";
    }
}
