package com.nubes.cj.basics.inheritence;

// java.lang.Object class 

class Person{
	String name;
	int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	void show() {
		System.out.println("Name :"+name);
		System.out.println("Age :"+age);
	}
		
}
class Employee extends Person{
	private float salary;
	Employee(String name,int age,float salary){
		super(name,age);
		this.salary = salary;
	}
	@Override
	void show() {
		super.show();
		System.out.println("Salary :"+salary);
	}
}
public class Example2 {
	public static void main(String[] args) {
		Person p = new Employee("Krishna",37,654567);
		p.show();
	}

}
