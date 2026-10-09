package com.lakshmi.studentportal.service;
//here only declaration 
import java.util.List;

import com.lakshmi.studentportal.model.Student;

public interface StudentService {
	Student saveStudent(Student s);
	
	Student getStudent(Integer id);
	
	List<Student> getAllStudents();
	
	void deleteStudent(Integer id);
	
	Student updateStudent(Student id);
}
