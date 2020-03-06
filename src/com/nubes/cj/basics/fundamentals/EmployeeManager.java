package com.nubes.cj.basics.fundamentals;

public class EmployeeManager {
	public static void main(String[] args) {
		Employee emp1 = new Employee("Shiva");
		Employee emp2 = new Employee("Rajesh",450000);
		
		System.out.println("Before :"+emp1);
		float salary = emp1.getSalary() + emp1.getSalary() * 0.3f;
		emp1.setSalary(salary);
		System.out.println("After :"+emp1);
		
	}
}
