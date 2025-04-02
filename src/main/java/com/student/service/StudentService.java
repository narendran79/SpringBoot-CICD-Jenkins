package com.student.service;

import java.util.List;

import com.student.model.Student;

public interface StudentService {

	void addStudent(Student student);
	void updateStudent(Student student);
	void deleteStudent(int studentId);
	Student getStudentById(int studentId);
	List<Student> getallStudent();
}
