package com.example.fiche2.repositories;

import com.example.fiche2.models.Course;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CoursesRepository extends CrudRepository<Course, Long> {
    Optional<Course> findByTitle(String title);
}
