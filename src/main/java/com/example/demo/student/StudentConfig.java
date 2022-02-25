package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student mario = new Student(
                    "Mario",
                    "mario.kart@gmail.com",
                    LocalDate.of(2000, Month.SEPTEMBER, 5)
            );
            Student luigi = new Student(
                    "Luigi",
                    "luigi.kart@gmail.com",
                    LocalDate.of(2002, Month.SEPTEMBER, 5)
            );

            repository.saveAll(
                    List.of(mario, luigi)
            );
        };
    }
}
