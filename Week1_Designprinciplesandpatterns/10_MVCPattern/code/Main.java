public class Main {
    public static void main(String[] args) {
        Student student = new Student("21CS101", "Kavya");
        StudentView studentView = new StudentView();
        StudentController controller = new StudentController(student, studentView);

        controller.updateView();

        controller.setStudentName("Kavya Ramesh");
        System.out.println("After updating model through controller:");
        controller.updateView();
    }
}
