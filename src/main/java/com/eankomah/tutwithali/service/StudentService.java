package com.eankomah.tutwithali.service;

import com.eankomah.tutwithali.entity.Student;
import com.eankomah.tutwithali.repository.Repo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService implements StudentServiceInterface {

    private final Repo studentRepo;
    @Override
    public Student save(Student s) {
        return this.studentRepo.save(s);
    }

    @Override
    public List<Student> findAllStudents() {
        return studentRepo.findAllStudents();
    }

    @Override
    public Student findByEmail(String email) {
        return studentRepo.findByEmail(email);
    }

    @Override
    public Student update(Student s) {
        return studentRepo.update(s);
    }

    @Override
    public void deleteByEmail(String email) {
        studentRepo.deleteByEmail(email);

    }

}
