package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	StudentService service;

	@PostMapping("/student")
	String addStudent(@RequestBody Student s) {

		service.saveStudent(s);

		return "student added";

	}

	@DeleteMapping("student/{sId}")
	String deleteStudent(@PathVariable int sId) {
		service.deleteStudent(sId);
		return "student deleted";

	}
    @GetMapping("/student/{sId}")
	Student getStudent (@PathVariable int sId) {
		Student s = service.getStudent(sId);
		return s;
	}

    @DeleteMapping("student")
    String deleteAllStudent()
    {
    	service.deleteAllStudent();
    	return "all student deleted";
    	
    }
    
    
}
