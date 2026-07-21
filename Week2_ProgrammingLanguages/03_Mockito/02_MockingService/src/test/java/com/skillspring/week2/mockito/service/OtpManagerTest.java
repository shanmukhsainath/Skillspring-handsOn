package com.skillspring.week2.mockito.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class OtpManagerTest {
    @Test
    void shouldReturnOtpSentWhenNotificationServiceSucceeds() {
        NotificationService notificationService = mock(NotificationService.class);
        when(notificationService.sendMessage("9876543210", "Your OTP is 123456")).thenReturn(true);
        OtpManager otpManager = new OtpManager(notificationService);
        assertEquals("OTP sent", otpManager.sendOtp("9876543210"));
    }
}
