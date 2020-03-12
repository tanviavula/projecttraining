package com.nubes.cj.ems.service;

import java.util.Scanner;

public class ExceptionExample {

	public static void main(String[] args) {
		System.out.println("Enter the name :");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		try {
			System.out.println(name.substring(0, 3).toUpperCase());
		}
		catch (ArithmeticException e) {
			System.out.println(e);
		}
		catch (Exception e) {
				System.out.println(e);
			
		} 
		System.out.println("End of the main");
		sc.close();

	}
}
