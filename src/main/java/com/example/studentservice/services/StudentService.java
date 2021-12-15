package com.example.studentservice.services;

import com.example.studentservice.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service

public class StudentService implements IStudentService {
    private List<Student> studentsList = new ArrayList<>(List.of(
            new Student("Paula", 28, "business", 1),
            new Student("Theo", 23, "biology", 2),
            new Student("Nadine", 29, "biology", 3)
    ));


    @Override
    public List<Student> getAllStudents() {
        return studentsList;
    }

    @Override
    public Student getOneStudent(int id) {
        for (int i = 0; i < studentsList.size(); i++) {
            if (id == studentsList.get(i).getId()) {
                return studentsList.get(i);
            }
        }
        throw new IllegalArgumentException();
    }

    @Override
    public List getStudentsBySubject(String subject) {
        ArrayList<Student> filteredList = new ArrayList<>();
        for (int i = 0; i < studentsList.size(); i++) {
            if (subject.equals(studentsList.get(i).getSubject())) {
            filteredList.add(studentsList.get(i));
            }
        } return filteredList;
    }
}




