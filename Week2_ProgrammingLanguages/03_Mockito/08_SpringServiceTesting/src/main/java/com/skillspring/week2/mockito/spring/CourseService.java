package com.skillspring.week2.mockito.spring;

import org.springframework.stereotype.Service;

@Service
public class CourseService {
    private final CourseRepository courseRepository;

    public CourseService(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    public String getCourseName(int courseId) {
        return courseRepository.findCourseNameById(courseId);
    }
}
