package com.mycompany.testproject.service;

import com.mycompany.testproject.model.Student;

import java.util.List;

public interface IStudentService {
    List<Student> findAll();
    void saveOrUpdateStudent(Student student);
    void getStudent(Long id);
    void deleteStudent(Long id);
}
