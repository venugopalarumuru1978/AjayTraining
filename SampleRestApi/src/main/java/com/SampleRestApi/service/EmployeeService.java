package com.SampleRestApi.service;

import java.util.List;

import com.SampleRestApi.beans.Employee;

public interface EmployeeService {

	public void AddEmp(Employee emp);
	public List<Employee> ShowAll();
}
