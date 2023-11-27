package com.eankomah.tutwithali.controller;

import com.eankomah.tutwithali.entity.Student;
import com.eankomah.tutwithali.service.StudentServiceInterface;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
@RequiredArgsConstructor
public class StudentController {


    private final StudentServiceInterface service;

    @PostMapping
    public Student save(@RequestBody Student student) {
        return service.save(student);
    }

    //localhost:8080//api/v1/students/allStudents
    @GetMapping
    public List<Student> findAllStudents(){
        return service.findAllStudents();
    }
    @GetMapping("/{email}")
    public Student findByEmail(@PathVariable String email){
        return service.findByEmail(email);
    }

    @PutMapping
    public Student updateStudent(Student student){
        return service.update(student);
    }
    @DeleteMapping("{email}")
    public void deleteStudent(@PathVariable("email") String email){
        service.deleteByEmail(email);
    }
}
