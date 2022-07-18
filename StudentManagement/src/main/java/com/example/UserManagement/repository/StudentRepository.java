package com.example.UserManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.UserManagement.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

	
}