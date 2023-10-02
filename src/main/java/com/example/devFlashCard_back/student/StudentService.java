package com.example.devFlashCard_back.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {
    public List<Student> getStudents() {
        return List.of(
                new Student(
                1L,
                "myriam",
                "myriam@mail.com",
                LocalDate.of(2000, Month.JANUARY, 14),
                21
        )
        );
    }
}
