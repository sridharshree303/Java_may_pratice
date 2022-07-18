package com.example.UserManagement.services;

import java.util.List;

import com.example.UserManagement.exceptions.DataNotFoundException;
import com.example.UserManagement.model.Student;

public interface StudentServices {

	public Student saveStudent(Student student);

    public	List<Student> getAllStudents();

	Student getStudentById(Long studentId) throws DataNotFoundException;

	Student deleteStudentById(Long studentId) throws DataNotFoundException;

	Student updateStudentDetailsById(Long studentId, Student student) throws DataNotFoundException;

//	public  String addUser(Student student);
//	public  Student readUser(int id) ;
//	public  String updateUser(Student student);
//	public  List<Student> allUsers() ;
//	public  String deleteUser();
}
