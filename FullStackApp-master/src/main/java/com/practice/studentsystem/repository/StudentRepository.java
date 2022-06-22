package com.practice.studentsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.practice.studentsystem.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {
	
}

