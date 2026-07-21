package com.skillspring.week2.junit.timeout;

import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTimeout;

class ReportGeneratorTest {
    @Test
    void shouldGenerateReportWithinTimeLimit() {
        ReportGenerator reportGenerator = new ReportGenerator();
        assertTimeout(Duration.ofSeconds(1), () -> assertEquals("Report generated", reportGenerator.generateReport()));
    }
}
