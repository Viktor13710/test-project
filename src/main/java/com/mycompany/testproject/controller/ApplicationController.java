package com.mycompany.testproject.controller;

import com.mycompany.testproject.service.IStudentService;
import com.mycompany.testproject.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class ApplicationController {

    @Resource
    private IStudentService studentService;

    @GetMapping(value = "/studentList")
    public String getStudents(Model model) {
        List<Student> studentList = studentService.findAll();
        model.addAttribute("studentList", studentList);
        return "studentList";
    }

    @PostMapping(value = "/saveOrUpdate")
    public void saveOrUpdateStudent(@RequestBody Student student) {
        studentService.saveOrUpdateStudent(student);
    }

    @GetMapping(value = "/studentList/id={id}")
    public void getStudent(@PathVariable("id") Long id) {
        studentService.getStudent(id);
    }

    @GetMapping(value = "/deleteStudent/id={id}")
    public void deleteStudent(@PathVariable("id") Long id) {
        studentService.deleteStudent(id);
    }
}
