package com.school.studentmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.school.studentmanagement.entity.Student;
import com.school.studentmanagement.service.StudentServiceImpl;

@RestController
public class StudentController {
	@Autowired
	StudentServiceImpl serviceImpl;

	@PostMapping("/createstudent")
	public ResponseEntity<?> createStudent(@RequestBody Student student) {
		serviceImpl.addStudent(student);

		return new ResponseEntity<Student>(student, HttpStatus.ACCEPTED);
	}

	@GetMapping("/getstudentdata/{id}")
	public Student getStudent(@PathVariable int id) {
		return serviceImpl.readStudent(id);
	}

	@GetMapping("/getallstudents")
	public List<Student> getAllStudentsData() {
		return serviceImpl.getAllStudents();
	}

	@PutMapping("/updatestudent/{id}")
	public void updateStudent(@PathVariable int id, @RequestBody Student student) {
		serviceImpl.updateStudentData(id, student);
	}

	@DeleteMapping("/deletestudent/{id}")
	public void deleteStudent(@PathVariable int id) {
		serviceImpl.deleteStudent(id);
	}

	@GetMapping("/getstudent")
	public Student getStudentObject() {
		return new Student();
	}
}
