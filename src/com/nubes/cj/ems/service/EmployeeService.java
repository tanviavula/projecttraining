package com.nubes.cj.ems.service;

import java.util.List;

import com.nubes.cj.ems.domain.Employee;

public interface EmployeeService {
	
		public Employee addEmployee(Employee employee);
		public Employee getEmployee(int empno);
		public List<Employee> getEmployees();
		public boolean deleteEmployee(int empno);
		public Employee search(String searchStr);
		
}
