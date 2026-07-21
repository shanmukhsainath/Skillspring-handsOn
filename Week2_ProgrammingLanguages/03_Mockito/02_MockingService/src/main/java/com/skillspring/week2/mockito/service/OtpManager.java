package com.skillspring.week2.mockito.service;

public class OtpManager {
    private final NotificationService notificationService;

    public OtpManager(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public String sendOtp(String mobileNumber) {
        boolean sent = notificationService.sendMessage(mobileNumber, "Your OTP is 123456");
        if (sent) {
            return "OTP sent";
        }
        return "OTP failed";
    }
}
