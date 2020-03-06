package com.nubes.cj.basics.fundamentals;

public class Employee{

	private int empno;
	private String ename;
	private float salary;

	public Employee(String ename) {
		this(ename, 25000);
	}

	public Employee(String ename, float salary) {
		this.empno = IdGenerator.getNewId();
		this.ename = ename;
		this.salary = salary;
	}

	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "[Empno :"+empno+",Name :"+ename+",Salary :"+salary+"]";
	}
}
