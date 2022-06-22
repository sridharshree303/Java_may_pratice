package com.practice.studentsystem.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice.studentsystem.model.Student;
import com.practice.studentsystem.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;
    
   @Autowired
   private CeaserService ceaserservice;


    @Override
    public String saveStudent(Student student) {
    	// encrypting name and address fields input data
    	int key[] = new int[2];
    	key[0] = ceaserservice.getRandNumber();
    	key[1] = ceaserservice.getRandNumber();
    	student.setKeys(key);
    	String name = ceaserservice.encryptTwokeys(student.getName(), key[0],key[1]);
    	student.setName(name);
    	String address = ceaserservice.encryptTwokeys(student.getAddress(), key[0],key[1]);
    	student.setAddress(address);
    	//saving data to repository
    	Student st = studentRepository.save(student);
        return "New student is Added";
    }
    
    
 //--------------------------------------------------------
    @Override
    public List<Student> getAllStudents() {
    	
    	List<Student> list = new ArrayList<Student>();
    	List<Student> modList = new ArrayList<Student>();
    	list = studentRepository.findAll();
    	list.forEach(li ->{
    		//retrive keys from database
        	int arrKeys[] = li.getKeys();
        	int key1 = arrKeys[0];
        	int key2 = arrKeys[1];
    		String name = ceaserservice.decrptytwokey(li.getName(),key1,key2);
    		li.setName(name);
    		String adress = ceaserservice.decrptytwokey(li.getAddress(),key1,key2);
    		li.setAddress(adress);
    		modList.add(li);
    	});
        return modList;
    }
    

    
    
    public Student get(Integer id){
        return studentRepository.findById(id).get();
    }

    public void delete(Integer id){
        studentRepository.deleteById(id);
    }
}
