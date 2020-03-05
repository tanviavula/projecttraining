package com.nubes.cj.basics.bank;

public class Account {

	int accno;
	String name;
	double balance;

	public Account(int accno, String name, double balance) {
		this.accno = accno;
		this.name = name;
		this.balance = balance;
	}

	public void withDraw(double amount) {
		if (amount >= balance) {
			System.out.println("Sorry! you don't have enough funds");
		} else {
			this.balance -= amount;
		}
	}

	public void deposite(double amount) {
		this.balance += amount;
	}

	public double checkBalance() {
		return this.balance;
	}

	public void showInfo() {
		System.out.println("Account Number:" + accno);
		System.out.println("Name :" + name);
		System.out.println("Balance :" + balance);
	}
}
