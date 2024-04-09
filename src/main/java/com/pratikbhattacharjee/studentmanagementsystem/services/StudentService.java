package com.pratikbhattacharjee.studentmanagementsystem.services;

import com.pratikbhattacharjee.studentmanagementsystem.entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudents();

    Student saveStudent(Student student);
}
