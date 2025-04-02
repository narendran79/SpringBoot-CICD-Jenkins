package com.student.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.model.Student;
import com.student.repository.StudentRepository;

@Service
public class StudentServiceImp implements StudentService {
	
	@Autowired
	private StudentRepository studentRepository;
	

	public void addStudent(Student student) {
		studentRepository.save(student);
	}
	
	
	public void updateStudent(Student student) {
		studentRepository.save(student);
	}

	
	public void deleteStudent(int studentId) {
		studentRepository.deleteById(studentId);
	}
	
	
	public Student getStudentById(int studentId) {
		return studentRepository.findById(studentId).orElse(null);
	}
	
	public List<Student> getallStudent(){
		return studentRepository.findAll();
	}
}
