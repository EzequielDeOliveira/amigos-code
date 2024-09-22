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
            Student luiza = new Student(
                            1L,
                            "Luiza",
                            "luiza.ana@gmail.com",
                            LocalDate.of(1994, Month.JULY, 6)
                    );

            Student ezequiel =  new Student(
                            2L,
                            "Ezequiel",
                            "ezequiel.reis@gmail.com",
                            LocalDate.of(1998, Month.AUGUST, 14)
                    );

            repository.saveAll(
                    List.of(luiza, ezequiel)
            );
        };
    }
}
