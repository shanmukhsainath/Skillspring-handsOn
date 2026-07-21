package com.skillspring.week2.mockito.verify;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

class RegistrationServiceTest {
    @Test
    void shouldVerifyEmailIsSentAfterRegistration() {
        EmailService emailService = mock(EmailService.class);
        RegistrationService registrationService = new RegistrationService(emailService);
        registrationService.register("student@example.com");
        verify(emailService).sendEmail("student@example.com", "Registration Successful");
    }
}
