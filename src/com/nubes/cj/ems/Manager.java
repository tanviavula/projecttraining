package com.nubes.cj.ems;

import java.util.List;

import com.nubes.cj.ems.domain.Employee;
import com.nubes.cj.ems.service.EmployeeService;
import com.nubes.cj.ems.service.EmployeeServiceImpl;

public class Manager{
	public static void main(String[] args) {
		EmployeeService emsService = new EmployeeServiceImpl();
		List<Employee> list = emsService.getEmployees();
	}
}