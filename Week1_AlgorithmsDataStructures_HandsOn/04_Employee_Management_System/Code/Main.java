public class Main {
    public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager(5);

        manager.addEmployee(new Employee(1, "Nisha", "Developer", 42000));
        manager.addEmployee(new Employee(2, "Rahul", "Tester", 36000));

        Employee employee = manager.searchEmployee(1);
        System.out.println("Search result:");
        employee.displayEmployee();

        manager.deleteEmployee(2);

        System.out.println("Available employees:");
        manager.displayEmployees();
    }
}
