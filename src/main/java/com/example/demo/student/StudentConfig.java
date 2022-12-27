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
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args ->{
            Student najifa = new Student(
                    "najifa",
                    "anjum@gmail.com",
                    LocalDate.of(2000, Month.APRIL, 10)

            );
            Student mariam = new Student(
                    "mariam",
                    "mariam@gmail.com",
                    LocalDate.of(2004, Month.APRIL, 10)

            );

            repository.saveAll(
                    List.of(najifa, mariam)
            );
        };
    }
}
