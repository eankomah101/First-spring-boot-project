package com.eankomah.tutwithali.service;

import com.eankomah.tutwithali.entity.Student;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {
    public List<Student> findAllStudents() {
        return List.of(
                new Student("Evans",
                        "Ankomah",
                        LocalDate.now(),
                        "contact1@gmail.com",
                        25),
                new Student("Godswill",
                        "Vittor",
                        LocalDate.now(),
                        "contact2@gmail.com",
                        25),
                new Student("Olivia",
                        "Dosimey",
                        LocalDate.now(),
                        "contact3@gmail.com",
                        25)
        );
    }

}
