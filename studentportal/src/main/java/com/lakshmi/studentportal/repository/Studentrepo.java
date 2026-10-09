package com.lakshmi.studentportal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lakshmi.studentportal.model.Student;
@Repository
public interface Studentrepo extends JpaRepository<Student, Integer>{

}
