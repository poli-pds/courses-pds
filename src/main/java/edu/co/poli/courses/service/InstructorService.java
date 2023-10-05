package edu.co.poli.courses.service;

import edu.co.poli.courses.persistence.entity.Instructor;

import java.util.List;

public interface InstructorService {

    Instructor save(Instructor instructor);
    List<Instructor> findAll();
}
