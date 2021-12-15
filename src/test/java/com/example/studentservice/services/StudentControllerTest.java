package com.example.studentservice.services;

import com.example.studentservice.controller.StudentController;
import com.example.studentservice.model.Student;
import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class StudentControllerTest {
    StudentService studentService = mock(StudentService.class);
    StudentController studentController = new StudentController(studentService);

    @Test
    public void testGetAllStudents() {

        //given
        ArrayList<Student> testList = new ArrayList<>(List.of(
                new Student("Martha", 28, "business", 1),
                new Student("Dominic", 31, "sports", 2),
                new Student("Jannis", 25, "biology", 3)));

        //when
        when(studentService.getAllStudents()).thenReturn(testList);
        List<Student> actual = studentController.getStudentsFromService();

        //then
        verify(studentService).getAllStudents();
       // assertArrayEquals(testList.toArray(), actual.toArray());
        assertThat(actual, Matchers.containsInAnyOrder(new Student("Martha", 28, "business", 1),
                new Student("Dominic", 31, "sports", 2),
                new Student("Jannis", 25, "biology", 3)));
    }
}




