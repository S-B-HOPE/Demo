package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Doctor {

	@Id
private int dId;
private String address;
private String email;
private String name;
private String spl;
private int exp;
private String education;


public int getdId() {
	return dId;
}
public void setdId(int dId) {
	this.dId = dId;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getSpl() {
	return spl;
}
public void setSpl(String spl) {
	this.spl = spl;
}
public int getExp() {
	return exp;
}
public void setExp(int exp) {
	this.exp = exp;
}
public String getEducation() {
	return education;
}
public void setEducation(String education) {
	this.education = education;
}
	
	
}
