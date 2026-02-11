package com.example.fiche2.services;

import com.example.fiche2.models.Course;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CoursesService {
    public Iterable<Course> getAllCourses() {
        return List.of(
                new Course("Spring Boot 101", "Introduction", 5),
                new Course("Bases de données", "Modèle relationnel", 4)
        );
    }
}
