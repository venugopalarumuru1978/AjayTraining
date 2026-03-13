package com.SampleRestApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.SampleRestApi.beans.Employee;
import com.SampleRestApi.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService  es;
	
	
	@PostMapping("/employee")
	public ResponseEntity<Object>  AddNewEmp(@RequestBody Employee emp)
	{
		es.AddEmp(emp);
		return new ResponseEntity<Object>("New Emp Added", HttpStatus.CREATED);
	}
	
	@GetMapping("/employee")
	public ResponseEntity<List<Employee>> ViewAllEmp()
	{
		return new ResponseEntity<List<Employee>>(es.ShowAll(), HttpStatus.OK);
	}
}
