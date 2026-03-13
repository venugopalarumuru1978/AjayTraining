package com.SampleRestApi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SampleRestApi.beans.Employee;
import com.SampleRestApi.repo.EmployeeRepo;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeRepo er;
	
	@Override
	public void AddEmp(Employee emp) {
		// TODO Auto-generated method stub
		er.save(emp);
	}

	@Override
	public List<Employee> ShowAll() {
		// TODO Auto-generated method stub
		return er.findAll();
	}

}
