package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.DocumentService;
import com.example.demo.service.ExcelServiceImpl;
import com.example.demo.service.PdfServiceImpl;

@RestController
public class DocumentController {

	@GetMapping("print/{type}")
	String invoice(@PathVariable String type) {

		DocumentService ds = Factory.createObject(type);
		ds.readDataFromDb();
		ds.processData();
		return ds.printData();
	}

}

class Factory {
	public static DocumentService createObject(String type) {
		if (type.equals("pdf")) {
			PdfServiceImpl pdfService = new PdfServiceImpl();
			return pdfService;
		}

		if (type.equals("excel")) {
			ExcelServiceImpl excelService = new ExcelServiceImpl();
			return excelService;
		}
		return null;
	}
}
