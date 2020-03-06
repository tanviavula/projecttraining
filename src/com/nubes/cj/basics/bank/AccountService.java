package com.nubes.cj.basics.bank;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class AccountService {
	
	public  Account[] getAllAcounts(String filePath) {
		Account accounts[]=null;
		try {
			List<String> lines = Files.readAllLines(Paths.get(filePath));
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
