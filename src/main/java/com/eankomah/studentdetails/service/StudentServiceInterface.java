package com.eankomah.studentdetails.service;

import com.eankomah.studentdetails.entity.Student;

import java.util.List;

public interface StudentServiceInterface {

    Student save(Student s);

    List<Student> findAllStudents();

    Student findByEmail(String email);

    Student update(Student s);

    void deleteByEmail(String email);
}
