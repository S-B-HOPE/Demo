package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Doctor;
import com.example.demo.repo.DoctorRepository;

@Service
@Qualifier("MdDoctorServiceImpl")

public class MdDoctorServiceImpl implements DoctorService {

	
	@Autowired
	DoctorRepository doctorRepository;
	
	
	@Override
	public void saveDoctor(Doctor d) {
     doctorRepository.save(d);		
	}

	@Override
	public void deleteDoctor(int dId) {
		doctorRepository.deleteById(dId);
	}

	@Override
	public void deleteAll() {
        doctorRepository.deleteAll();		
	}

	@Override
	public Doctor getDoctor(int dId) {
		// TODO Auto-generated method stub
		return doctorRepository.findById(dId).get();
	}


	public String getOerationTheaterDetail() {
       return "room no 1";		
	}

}
