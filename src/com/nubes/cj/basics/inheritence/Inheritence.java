package com.nubes.cj.basics.inheritence;

class Car{
	String color= "Green";
	void show() {
		System.out.println("Car information");
	}
}
class Maruthi extends Car{
	String model = "ABC";
	void show() {
		System.out.println("Maruthi car");
	}
}

class BMW extends Car{
	String model = "ABC";
	void show() {
		System.out.println("BMW car");
	}
}

public class Inheritence {
	public static void main(String[] args) {
		Car obj = new Maruthi();
		obj.show();
	}
}
