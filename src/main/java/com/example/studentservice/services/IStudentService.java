package com.example.studentservice.services;

import com.example.studentservice.model.Student;

import java.util.List;

public interface IStudentService {
    List getAllStudents();
    Student getOneStudent(int id);
    List getStudentsBySubject(String subject);
    }
