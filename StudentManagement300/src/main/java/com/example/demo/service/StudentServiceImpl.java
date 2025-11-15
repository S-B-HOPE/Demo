package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;
import com.example.demo.repo.StudentRepo;

@Service
public class StudentServiceImpl implements StudentService {

	
	@Autowired
	StudentRepo studentRepo;
	
	@Override
	public void saveStudent(Student s) {
     studentRepo.save(s);  	
	}

	@Override
	public void deleteStudent(int sId) {
studentRepo.deleteById(sId);	
	}

	@Override
	public void deleteAllStudent() {
studentRepo.deleteAll();		
	}

	@Override
	public Student getStudent(int sId) {
		
//		Student s= studentRepo.getById(sId);
   
		
		return studentRepo.findById(sId).get();
		
		
		
		   
	}

}
