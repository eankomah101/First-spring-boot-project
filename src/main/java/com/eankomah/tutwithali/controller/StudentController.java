package com.eankomah.tutwithali.controller;

import com.eankomah.tutwithali.entity.Student;
import com.eankomah.tutwithali.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
@RequiredArgsConstructor
public class StudentController {


    private final StudentService service;

    //localhost:8080//api/v1/students/allStudents
    @GetMapping("/allStudents")
    public List<Student> findAllStudents(){
        return service.findAllStudents();
    }
}
