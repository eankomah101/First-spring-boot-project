package com.eankomah.tutwithali.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {

    //htttp:8080//api/v1/students/allStudents
    @GetMapping("/allStudents")
    public List<String> findAllStudents(){
        return List.of(
              "Evans",
              "Joseph",
                "Kwame"
        );
    }
}
