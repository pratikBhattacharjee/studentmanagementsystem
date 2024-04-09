package com.pratikbhattacharjee.studentmanagementsystem.services;

import com.pratikbhattacharjee.studentmanagementsystem.entity.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService {
    List<Student> getAllStudents();

    Student saveStudent(Student student);

    Optional<Student> findById(Long id);

    void deleteById(Long id);
}
