package com.SampleRestApi.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	
	List<String> strList = new ArrayList<String>();
	
	public TestController()
	{
		strList.add("Ajay");
		strList.add("Venugopal");
		strList.add("Nani");
	}
	
	@GetMapping("/demo")
	public String DemoApi()
	{
		return "Hi This is First RestAPI example";
	}
	
	@GetMapping("/strinfo")
	public ResponseEntity<List<String>>  testinfo()
	{
		return new ResponseEntity<List<String>>(strList, HttpStatus.OK);
	}

}
