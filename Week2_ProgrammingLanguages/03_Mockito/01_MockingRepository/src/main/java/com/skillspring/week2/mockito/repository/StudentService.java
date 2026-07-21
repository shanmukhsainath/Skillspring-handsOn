package com.skillspring.week2.mockito.repository;

public class StudentService {
    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public String getStudentName(int id) {
        Student student = studentRepository.findById(id);
        if (student == null) {
            return "Student not found";
        }
        return student.getName();
    }
}
