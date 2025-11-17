package com.example.demo.service;

public class ExcelServiceImpl implements DocumentService {

	@Override
	public void readDataFromDb() {
		System.out.println("read data from db");
	}

	@Override
	public void processData() {
		System.out.println("process data for excel");

	}

	@Override
	public String printData() {
		System.out.println("print data");
		return "excel";
	}

}
