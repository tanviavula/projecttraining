package com.nubes.cj.basics.bank;

public class Savings extends Account{
		double  minBlance;
		
		public Savings(int accno, String name, double balance,double minBalance) {
			super(accno,name,balance);
			this.minBlance = minBalance;
		}
		
		// Override withdraw
		
		
}
