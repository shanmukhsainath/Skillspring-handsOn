public class Employee {
    private int id;
    private String name;
    private String department;
    private double salary;

    public Employee(EmployeeBuilder builder) {
        id = builder.getId();
        name = builder.getName();
        department = builder.getDepartment();
        salary = builder.getSalary();
    }

    public void displayEmployee() {
        System.out.println("Employee Id: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
    }
}

