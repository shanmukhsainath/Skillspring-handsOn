public class StudentView {
    public void printStudentDetails(String rollNumber, String name) {
        // View only displays data and does not change the model.
        System.out.println("Student Details");
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
    }
}
