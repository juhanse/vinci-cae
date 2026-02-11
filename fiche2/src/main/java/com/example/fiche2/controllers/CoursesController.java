package com.example.fiche2.controllers;

import com.example.fiche2.models.Course;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.fiche2.services.CoursesService;

@RestController
@RequestMapping("/courses")
public class CoursesController {
    private final CoursesService service;

    public CoursesController(CoursesService service) {
        this.service = service;
    }

    @GetMapping("/")
    public Iterable<Course> getCourses() {
        return service.getAllCourses();
    }
}
