package com.example.UserManagement.services;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.UserManagement.exceptions.DataNotFoundException;

import com.example.UserManagement.model.Student;
import com.example.UserManagement.repository.StudentRepository;

@Service
public class StudentServicesImplm implements StudentServices {

	private static final Logger LOG = LoggerFactory.getLogger(StudentServices.class);

	@Autowired
	private StudentRepository studentRepository;
	
	
	@Override
	public List<Student> getAllStudents() {
		return studentRepository.findAll();
	}

	@Override
	public Student saveStudent(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public Student getStudentById(Long studentId) throws DataNotFoundException {

		// return studentRepository.findById(studentId).get();
		Optional<Student> studentOpt = studentRepository.findById(studentId);
		if (studentOpt.isPresent()) {
			return studentOpt.get();
		} else {
			LOG.info("Student is NOT available.");
			throw new DataNotFoundException(studentId + " this student is not exist.");
		}
	}

	@Override
	public Student deleteStudentById(Long studentId) throws DataNotFoundException {

		LOG.info("deleteEmployeeById");
		Optional<Student> studentOpt = studentRepository.findById(studentId);
		if (studentOpt.isPresent()) {
			studentRepository.deleteById(studentId);
			return studentOpt.get();
		} else {
			throw new DataNotFoundException(studentId + " this student does not exist.");
		}
	}

	@Override
	public Student updateStudentDetailsById(Long studentId, Student student) throws DataNotFoundException {

		System.out.println("Service updateEmployee");
		if (studentRepository.existsById(student.getId()))
			return studentRepository.save(student);
		throw new DataNotFoundException("Student with eid " + student.getId() + " does not exist.");

	}

}
