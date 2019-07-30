package com.mycompany.testproject.service;

import com.mycompany.testproject.model.Student;
import com.mycompany.testproject.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService implements IStudentService {

    @Autowired
    private StudentRepository repository;

    @Override
    public List<Student> findAll() {
        return (List<Student>) repository.findAll();
    }

    @Override
    public void saveOrUpdateStudent(Student student) {
        repository.save(student);
    }

    @Override
    public void getStudent(Long id) {
        repository.findById(id);
    }

    @Override
    public void deleteStudent(Long id) {
        repository.deleteById(id);
    }
}
