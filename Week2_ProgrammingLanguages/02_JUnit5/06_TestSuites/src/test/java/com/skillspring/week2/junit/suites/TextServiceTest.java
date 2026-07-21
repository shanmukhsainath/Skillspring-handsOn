package com.skillspring.week2.junit.suites;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TextServiceTest {
    @Test
    void shouldConvertTextToUpperCase() {
        TextService textService = new TextService();
        assertEquals("JAVA", textService.toUpperCase("java"));
    }
}
