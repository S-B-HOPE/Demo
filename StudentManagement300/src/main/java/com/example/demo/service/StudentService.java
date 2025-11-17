package com.example.demo.service;

import com.example.demo.entity.Student;

public interface StudentService {
	
	public void saveStudent(Student s);
	public void deleteStudent(int sId);
	public void deleteAllStudent();
	public Student  getStudent(int sId);

}
