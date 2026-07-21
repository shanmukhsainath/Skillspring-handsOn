package com.skillspring.week2.junit.stringutility;

public class StringUtility {
    public String reverse(String text) {
        if (text == null) {
            return null;
        }
        return new StringBuilder(text).reverse().toString();
    }

    public boolean isPalindrome(String text) {
        if (text == null) {
            return false;
        }
        String cleanedText = text.replace(" ", "").toLowerCase();
        return cleanedText.equals(reverse(cleanedText));
    }

    public int countVowels(String text) {
        if (text == null) {
            return 0;
        }
        int count = 0;
        for (int index = 0; index < text.length(); index++) {
            char letter = Character.toLowerCase(text.charAt(index));
            if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
                count++;
            }
        }
        return count;
    }
}
