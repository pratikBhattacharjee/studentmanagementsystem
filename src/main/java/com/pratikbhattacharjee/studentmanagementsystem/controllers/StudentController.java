package com.pratikbhattacharjee.studentmanagementsystem.controllers;

import com.pratikbhattacharjee.studentmanagementsystem.entity.Student;
import com.pratikbhattacharjee.studentmanagementsystem.services.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Optional;

@Controller
public class StudentController {

    private StudentService studentService;

    private static final String MAINREDIRECT = "redirect:/student/all";


    public StudentController(StudentService studentService) {
        super();
        this.studentService = studentService;
    }

    //handler method to handle student list request
    @GetMapping("/student/all")
    public String listStudent(Model model){
        model.addAttribute("students", studentService.getAllStudents());
        return "students";
    }

    @GetMapping("/student/new")
    public String createNewStudent(Model model){
        Student student = new Student();
        model.addAttribute("student", student);
        return "create_student";
    }

    @PostMapping("/students")
    public String saveStudent(@ModelAttribute("student") Student student){
        studentService.saveStudent(student);
        return MAINREDIRECT;
    }

    @GetMapping("/student/edit/{id}")
    public String editStudent(@PathVariable("id") Long id, Model model){
        Optional<Student> student = studentService.findById(id);
        if(student.isPresent()){
            model.addAttribute("student", student.get());
            return "edit_student";
        }else{
            return MAINREDIRECT;
        }
    }

    @PostMapping("/students/{id}")
    public String editStudentRequestHandler(@PathVariable("id") Long id, Student student){
        student.setId(id);
        //Potential error: The below method actually doesn't edit
        studentService.saveStudent(student);
        return MAINREDIRECT;
    }

    @GetMapping("/student/delete/{id}")
    public String deleteStudent(@PathVariable("id") Long id, Model model){
        studentService.deleteById(id);
        return MAINREDIRECT;
    }



}
