package com.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.List;

import com.student.model.Student;
import com.student.service.StudentService;

@Controller
@RequestMapping("/api/student")
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@GetMapping("/list")
    public List<Student> getListStudents() {
        return Arrays.asList(
                new Student(1, "John Doe",21,"CSE"),
                new Student(2, "Jane Doe",22,"ECE")
        );
    }
	
	@GetMapping("/all")
	@ResponseBody
	public List<Student> getAllStudents(){
		return studentService.getallStudent();
	}
	
	@GetMapping("/get/{id}")
	@ResponseBody
	public Student getStudentById(@PathVariable int id) {
		return studentService.getStudentById(id);
	}
	
	@PostMapping("/add")
	@ResponseBody
	public String addStudent(@RequestBody Student student) {
		studentService.addStudent(student);
		return "Student added Successfully!";
	}
	
	@PutMapping("/update")
	@ResponseBody
	public String updateStudent(@RequestBody Student student) {
		studentService.updateStudent(student);
		return "Student updated Successfully!";
	}
	
	@DeleteMapping("/delete/{id}")
	@ResponseBody
	public String deleteStudent(@PathVariable int id) {
		studentService.deleteStudent(id);
		return "Student deleted successfully!";
	}
}
