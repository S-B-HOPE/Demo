package com.example.demo.service;

public class PdfServiceImpl implements DocumentService {

	@Override
	public void readDataFromDb() {
		System.out.println("read data from db");
	}

	@Override
	public void processData() {
		System.out.println("process data for pdf");

	}

	@Override
	public String printData() {
		System.out.println("print data");
		return "pdf";
	}

}
