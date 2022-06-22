package com.practice.studentsystem.service;

import java.util.List;

import com.practice.studentsystem.model.Student;

public interface StudentService {
    public String saveStudent(Student student);
    public List<Student> getAllStudents();
    public Student get(Integer id);
    public void delete(Integer id);
}
