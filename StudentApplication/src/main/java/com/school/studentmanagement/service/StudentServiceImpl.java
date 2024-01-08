package com.school.studentmanagement.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.school.studentmanagement.entity.Student;
import com.school.studentmanagement.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentRepository studentRepository;

	@Override
	public void addStudent(Student student) {
		studentRepository.save(student);

	}

	@Override
	public List<Student> getAllStudents() {
		return studentRepository.findAll();

	}

	@Override
	public Student readStudent(int id) {
		return studentRepository.findById(id).get();
	}

	@Override
	public Student updateStudentData(int id, Student student) {
		Student student2 = studentRepository.findById(id).get();
		student2.setStudent_firstName(student.getStudent_firstName());
		student2.setStudent_lastName(student.getStudent_lastName());
		student2.setStudent_gmailID(student.getStudent_gmailID());
		return studentRepository.save(student);

	}

	@Override
	public void deleteStudent(int id) {
		Student student = studentRepository.findById(id).get();
		studentRepository.delete(student);

	}

}
