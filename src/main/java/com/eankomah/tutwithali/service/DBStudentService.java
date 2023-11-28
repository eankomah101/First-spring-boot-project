package com.eankomah.tutwithali.service;

import com.eankomah.tutwithali.entity.Student;
import com.eankomah.tutwithali.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@Primary
@RequiredArgsConstructor
public class DBStudentService implements StudentServiceInterface{

    private final StudentRepository repository;
    @Override
    public Student save(Student s) {
        return repository.save(s);
    }

    @Override
    public List<Student> findAllStudents() {

        return repository.findAll();
    }

    @Override
    public Student findByEmail(String email) {
        return repository.findByEmail(email);
    }

    @Override
    public Student update(Student s) {
        return repository.save(s);
    }

    @Override
    public void deleteByEmail(String email) {
        repository.deleteByEmail(email);

    }
}
