package com.example.UserManagement.controller;

import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.UserManagement.exceptions.DataNotFoundException;
import com.example.UserManagement.model.Student;
import com.example.UserManagement.services.StudentServices;


@RestController
@CrossOrigin
@RequestMapping("/student")
public class StudentController {

	@Autowired 
	private StudentServices studentServices;
	
	private final Logger LOGGER=LoggerFactory.getLogger(StudentController.class);
	
	
	@GetMapping("/")
	public String Welcome() {
		System.out.println("checking..");
		return "Happy coding..";
	}
	 
	
	@PostMapping("/saveStudent")
	public Student saveStudent(@Valid @RequestBody Student student)
	{
		LOGGER.info("Info is created for student");
		return studentServices.saveStudent(student);
	}
	
	@GetMapping("/getAllStudents")
	public List<Student> getAllStudents(){
		LOGGER.info("Get all data ");
		return  studentServices.getAllStudents();
		
	}
	
	
	@GetMapping("/getStudentById/{id}")
	public ResponseEntity<Student> getStudentById(@PathVariable("id") Long studentId) throws DataNotFoundException {
	
		Student result=  studentServices.getStudentById(studentId);
		HttpHeaders headers = new HttpHeaders();

		headers.add("message", "student details are retrieved.");

		LOGGER.info(headers.toString());

		ResponseEntity<Student> response = new ResponseEntity<>(result, headers, HttpStatus.OK);

		return response;
		
	}
	
	
	@DeleteMapping("/deleteStudentById/{id}")
	public ResponseEntity<Student> deleteStudentById(@PathVariable ("id")Long studentId) throws DataNotFoundException {
		
		LOGGER.info("deleteStudentById");
		
		Student result = studentServices.deleteStudentById(studentId);
		
		HttpHeaders headers = new HttpHeaders();
		
		headers.add("message", "Student deleted successfully.");
		ResponseEntity<Student> response = new ResponseEntity<>(result, headers, HttpStatus.OK);
		return response;
	}
	
//	@DeleteMapping("/deleteStudentById/{id}")
//	public String deleteStudentById(@PathVariable("id") Long studentId) {
//		  studentServices.deleteStudentById(studentId);
//		  LOGGER.info("Data is deleted by id");
//		  return " Student data deleted successfully !!!!"; 
//	}
	
	@PutMapping("/updateStudentDetailsById/{id}")
	public ResponseEntity<Student> updateStudentDetailsById(@PathVariable("id") Long studentId, @RequestBody Student student) throws DataNotFoundException {
		LOGGER.info("Data is updated by id");
		
		Student result = studentServices. updateStudentDetailsById(studentId,student);
		
		HttpHeaders headers = new HttpHeaders();
		
		headers.add("message", "Student deleted successfully.");
		
		ResponseEntity<Student> response = new ResponseEntity<>(result, headers, HttpStatus.OK);
		return  response;
		
		
	}
}
