package edu.co.poli.courses.service;

import edu.co.poli.courses.persistence.entity.Course;

import java.util.List;

public interface CourseService {

    Course save(Course course);
    List<Course> findAll();
}
