package com.pratikbhattacharjee.studentmanagementsystem.repository;

import com.pratikbhattacharjee.studentmanagementsystem.services.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
