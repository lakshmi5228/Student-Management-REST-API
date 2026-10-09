package com.lakshmi.studentportal.service;
// here only implementations
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lakshmi.studentportal.model.Student;
import com.lakshmi.studentportal.repository.Studentrepo;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	Studentrepo studentrepo;
	@Override
	public Student saveStudent(Student s) {
		
		return studentrepo.save(s);
	}

	@Override
	public Student getStudent(Integer id) {
		
		return studentrepo.findById(id).orElseThrow();
	}

	@Override
	public List<Student> getAllStudents() {
	    return studentrepo.findAll();
	}

	@Override
	public void deleteStudent(Integer id) {
		
		studentrepo.deleteById(id);
		
	}

	@Override
	public Student updateStudent(Student s) {
		return studentrepo.save(s);
	}

}
