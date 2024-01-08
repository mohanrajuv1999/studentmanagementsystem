package com.school.studentmanagement.service;

import java.util.List;

import com.school.studentmanagement.entity.Student;

public interface StudentService {
	public void addStudent(Student student);

	public List<Student> getAllStudents();

	Student readStudent(int id);

	Student updateStudentData(int id, Student student);

	void deleteStudent(int id);

}
