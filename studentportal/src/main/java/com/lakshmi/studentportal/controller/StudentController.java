package com.lakshmi.studentportal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lakshmi.studentportal.model.Student;
import com.lakshmi.studentportal.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	StudentService studentService;
	
	@GetMapping("hello")
	String hello() {
		return "Good Morning";
	}
	
	//http://localhost:9898/student/ss
	@PostMapping("/ss")
	Student createStudent(@RequestBody Student s) {
		return studentService.saveStudent(s);
		
	}
	
	//http://localhost:9898/student/getAll
	@GetMapping("/getAll")
	public List<Student> getAllStudents() {
	    return studentService.getAllStudents();
	}
	
	//http://localhost:9898/student/updateStudent/3
	@PutMapping("updateStudent/{sid}")
	Student updateStudent(@PathVariable Integer sid, @RequestBody Student s) {
		
		Student studentFromDB = getStudent(sid);
		
		studentFromDB.setAge(s.getAge());
		studentFromDB.setFirstname(s.getFirstname());
		studentFromDB.setLastname(s.getLastname());	
		studentFromDB.setTotalmarks(s.getTotalmarks());
		studentFromDB.setLocation(s.getLocation());
		studentFromDB.setBranch(s.getBranch());
		return studentService.updateStudent(studentFromDB);
	}
	
	//http://localhost:9898/student/deleteStudent/1
	@DeleteMapping("deleteStudent/{sid}")
	String deleteStudent(@PathVariable Integer sid) {
		studentService.deleteStudent(sid);
		return "Delete Student with " + sid + "Successfully.";
	}
	
	//http:localhost:9898/student/getStudent/1
	@GetMapping("getStudent/{sid}")
	Student getStudent(@PathVariable Integer sid){
		return studentService.getStudent(sid);
		
	}
	
}
