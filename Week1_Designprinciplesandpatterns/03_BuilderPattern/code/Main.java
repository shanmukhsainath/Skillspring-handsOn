public class Main {
    public static void main(String[] args) {
        Employee employee = new EmployeeBuilder()
                .setId(101)
                .setName("Arjun")
                .setDepartment("Java FSE")
                .setSalary(35000)
                .build();

        employee.displayEmployee();
    }
}

