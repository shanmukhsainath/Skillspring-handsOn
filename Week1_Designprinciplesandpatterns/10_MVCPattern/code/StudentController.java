public class StudentController {
    private Student student;
    private StudentView studentView;

    public StudentController(Student student, StudentView studentView) {
        this.student = student;
        this.studentView = studentView;
    }

    public void setStudentName(String name) {
        student.setName(name);
    }

    public void setStudentRollNumber(String rollNumber) {
        student.setRollNumber(rollNumber);
    }

    public void updateView() {
        // Controller passes model data to the view.
        studentView.printStudentDetails(student.getRollNumber(), student.getName());
    }
}
