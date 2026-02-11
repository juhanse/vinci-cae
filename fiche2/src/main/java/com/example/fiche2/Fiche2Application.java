package com.example.fiche2;

import com.example.fiche2.models.Course;
import com.example.fiche2.repositories.CoursesRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Fiche2Application {
    public static void main(String[] args) {
        SpringApplication.run(Fiche2Application.class, args);
    }

    @Bean
    CommandLineRunner seed(CoursesRepository coursesRepository) {
        return args -> {
            coursesRepository.save(new Course("Spring Boot 101", "Introduction", 5));
            coursesRepository.save(new Course("Bases de données", "Relationnel & SQL", 4));
            coursesRepository.save(new Course("DevOps", "CI/CD", 3));
        };
    }
}
