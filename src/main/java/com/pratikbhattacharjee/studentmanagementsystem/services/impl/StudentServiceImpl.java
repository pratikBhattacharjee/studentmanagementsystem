package com.pratikbhattacharjee.studentmanagementsystem.services.impl;

import com.pratikbhattacharjee.studentmanagementsystem.entity.Student;
import com.pratikbhattacharjee.studentmanagementsystem.repository.StudentRepository;
import com.pratikbhattacharjee.studentmanagementsystem.services.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {


    private final StudentRepository studentRepository;
    public StudentServiceImpl(StudentRepository studentRepository){
        this.studentRepository = studentRepository;

    }



    @Override
    public List<Student> getAllStudents() {
        return this.studentRepository.findAll();
    }

    @Override
    public Student saveStudent(Student student) {
        return this.studentRepository.save(student);
    }

    @Override
    public Optional<Student> findById(Long id) {
        return studentRepository.findById(id);
    }

    @Override
    public void deleteById(Long id) {
        studentRepository.deleteById(id);
    }


}
