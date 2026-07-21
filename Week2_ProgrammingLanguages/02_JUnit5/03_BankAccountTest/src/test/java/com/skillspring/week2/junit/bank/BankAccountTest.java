package com.skillspring.week2.junit.bank;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class BankAccountTest {
    @Test
    void shouldCreateAccountWithOpeningBalance() {
        BankAccount account = new BankAccount(5000);
        assertEquals(5000, account.getBalance());
    }

    @Test
    void shouldDepositAmount() {
        BankAccount account = new BankAccount(5000);
        account.deposit(1500);
        assertEquals(6500, account.getBalance());
    }

    @Test
    void shouldWithdrawAmount() {
        BankAccount account = new BankAccount(5000);
        account.withdraw(2000);
        assertEquals(3000, account.getBalance());
    }

    @Test
    void shouldRejectWithdrawalWhenBalanceIsLow() {
        BankAccount account = new BankAccount(1000);
        assertThrows(IllegalArgumentException.class, () -> account.withdraw(2000));
    }
}
