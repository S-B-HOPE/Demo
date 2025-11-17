package com.example.demo.service;

import com.example.demo.entity.Doctor;

public interface DoctorService {

	
	void saveDoctor(Doctor d);
	void deleteDoctor(int dId);
	void deleteAll();
	Doctor getDoctor(int dId);
	
	
}
