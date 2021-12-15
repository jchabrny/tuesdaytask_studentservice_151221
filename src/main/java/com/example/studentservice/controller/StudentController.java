package com.example.studentservice.controller;

import com.example.studentservice.model.Student;
import com.example.studentservice.services.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("student")
@RestController
public class StudentController {
    private StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public List<Student> getStudentsFromService() {
        return studentService.getAllStudents();
    }

    @GetMapping(path = "{id}")
    public Student getOneStudent(@PathVariable int id) {
        return studentService.getOneStudent(id);
    }


    @GetMapping("filterbysubject")
    public List<Student> getStudentsBySubject(@RequestParam String subject) {
        return studentService.getStudentsBySubject(subject);
    }
}



