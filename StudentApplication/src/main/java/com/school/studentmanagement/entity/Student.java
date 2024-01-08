package com.school.studentmanagement.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="student")
//@Getter
//@Setter
//@NoArgsConstructor
//@AllArgsConstructor
public class Student 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int student_id;
	private String student_firstName;
	private String student_lastName;
	private String student_gmailID;
	public Student(int student_id, String student_firstName, String student_lastName, String student_gmailID) {
		super();
		this.student_id = student_id;
		this.student_firstName = student_firstName;
		this.student_lastName = student_lastName;
		this.student_gmailID = student_gmailID;
	}
	public Student() {
		super();
	}
	public int getStudent_id() {
		return student_id;
	}
	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}
	public String getStudent_firstName() {
		return student_firstName;
	}
	public void setStudent_firstName(String student_firstName) {
		this.student_firstName = student_firstName;
	}
	public String getStudent_lastName() {
		return student_lastName;
	}
	public void setStudent_lastName(String student_lastName) {
		this.student_lastName = student_lastName;
	}
	public String getStudent_gmailID() {
		return student_gmailID;
	}
	public void setStudent_gmailID(String student_gmailID) {
		this.student_gmailID = student_gmailID;
	}

	
}
