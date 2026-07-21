package com.skillspring.week2.mockito.spring;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class CourseServiceTest {
    @Mock
    private CourseRepository courseRepository;

    @InjectMocks
    private CourseService courseService;

    @Test
    void shouldTestSpringServiceUsingMockito() {
        when(courseRepository.findCourseNameById(1)).thenReturn("Java FSE");
        assertEquals("Java FSE", courseService.getCourseName(1));
    }
}
