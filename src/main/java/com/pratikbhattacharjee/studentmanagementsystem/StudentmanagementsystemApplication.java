package com.pratikbhattacharjee.studentmanagementsystem;

import com.pratikbhattacharjee.studentmanagementsystem.entity.Student;
import com.pratikbhattacharjee.studentmanagementsystem.repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentmanagementsystemApplication implements CommandLineRunner {
	private StudentRepository studentRepository;

	public StudentmanagementsystemApplication(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(StudentmanagementsystemApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Student student1 = new Student("Sam", "Abdullah", "samabdul@bomber.com");
		Student student2 = new Student("White", "Nigga", "entitled@nigger.com");
		Student student3 = new Student("Anu", "Tom", "anty@random.com");

		studentRepository.save(student1);
		studentRepository.save(student2);
		studentRepository.save(student3);

	}
}
