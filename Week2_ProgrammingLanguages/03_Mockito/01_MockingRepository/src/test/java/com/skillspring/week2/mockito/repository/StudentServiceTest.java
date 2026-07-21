package com.skillspring.week2.mockito.repository;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class StudentServiceTest {
    @Test
    void shouldReturnStudentNameFromMockRepository() {
        StudentRepository repository = mock(StudentRepository.class);
        when(repository.findById(1)).thenReturn(new Student(1, "Ananya"));
        StudentService service = new StudentService(repository);
        assertEquals("Ananya", service.getStudentName(1));
    }
}
