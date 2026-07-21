package com.skillspring.week2.mockito.database;

public class PayrollService {
    private final EmployeeDatabase employeeDatabase;

    public PayrollService(EmployeeDatabase employeeDatabase) {
        this.employeeDatabase = employeeDatabase;
    }

    public double calculateAnnualSalary(int employeeId) {
        double monthlySalary = employeeDatabase.findSalaryByEmployeeId(employeeId);
        return monthlySalary * 12;
    }
}
