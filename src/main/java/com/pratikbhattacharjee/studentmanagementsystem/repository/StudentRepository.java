package com.pratikbhattacharjee.studentmanagementsystem.repository;

import com.pratikbhattacharjee.studentmanagementsystem.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

//No need to add @Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}
