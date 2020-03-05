package com.nubes.cj.basics.bank;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Manager {

		public static void main(String[] args) {
			
				Account accounts[]= loadFromFile();
				for(Account acc:accounts) {
					acc.showInfo();
					System.out.println("-------------------------");
				}
				
				
				
				// Find the account which has max amount as a balance
				
				// Find the account which as min amount as a balance
				
				// Find the total amount of the all the accounts
				
				// Print account details by balance in DESC order
				
				
		}
		
		private static Account[] loadFromFile() {
				Account accounts[]=null;
				try {
					List<String> lines = Files.readAllLines(Paths.get("account.txt"));
					accounts = new Account[lines.size()];
					int i = 0;
					for(String acc:lines) {
						String arr[] = acc.split(",");
						int accno = Integer.parseInt(arr[0]);
						String name = arr[1];
						double balance = Double.parseDouble(arr[2]);
						Account obj = new Account(accno, name, balance);
						accounts[i++] = obj;
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
				return accounts;
		}
}
