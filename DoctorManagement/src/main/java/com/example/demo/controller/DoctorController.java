package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Doctor;
import com.example.demo.service.DoctorService;

@RestController
public class DoctorController {

	
	@Autowired
	DoctorService bamsDoctorServiceImpl;
	
	@Autowired
	 DoctorService mdDoctorServiceImpl;
	
	@PostMapping("doctor")
	String addDoctor(@RequestBody Doctor d)
	{
		if(d.getEducation().equals("bams"))
		    bamsDoctorServiceImpl.saveDoctor(d);
		
		if(d.getEducation().equals("md"))
			mdDoctorServiceImpl.saveDoctor(d);
		return "doctor added";
	}
}
