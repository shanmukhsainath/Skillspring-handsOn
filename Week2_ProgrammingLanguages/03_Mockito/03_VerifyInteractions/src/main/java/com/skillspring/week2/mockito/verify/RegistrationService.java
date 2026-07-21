package com.skillspring.week2.mockito.verify;

public class RegistrationService {
    private final EmailService emailService;

    public RegistrationService(EmailService emailService) {
        this.emailService = emailService;
    }

    public void register(String email) {
        emailService.sendEmail(email, "Registration Successful");
    }
}
