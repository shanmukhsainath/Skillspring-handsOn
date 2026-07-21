package com.skillspring.week2.mockito.database;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class PayrollServiceTest {
    @Test
    void shouldMockDatabaseCall() {
        EmployeeDatabase employeeDatabase = mock(EmployeeDatabase.class);
        when(employeeDatabase.findSalaryByEmployeeId(101)).thenReturn(50000.0);
        PayrollService payrollService = new PayrollService(employeeDatabase);
        assertEquals(600000.0, payrollService.calculateAnnualSalary(101));
    }
}
