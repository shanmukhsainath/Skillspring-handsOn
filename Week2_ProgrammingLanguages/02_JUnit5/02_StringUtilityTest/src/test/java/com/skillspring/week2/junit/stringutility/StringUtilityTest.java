package com.skillspring.week2.junit.stringutility;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

class StringUtilityTest {
    private final StringUtility stringUtility = new StringUtility();

    @Test
    void shouldReverseText() {
        assertEquals("avaJ", stringUtility.reverse("Java"));
    }

    @Test
    void shouldReturnNullWhenReverseInputIsNull() {
        assertNull(stringUtility.reverse(null));
    }

    @Test
    void shouldCheckPalindrome() {
        assertTrue(stringUtility.isPalindrome("madam"));
        assertFalse(stringUtility.isPalindrome("mentor"));
    }

    @Test
    void shouldCountVowels() {
        assertEquals(3, stringUtility.countVowels("Cognizant"));
    }
}
