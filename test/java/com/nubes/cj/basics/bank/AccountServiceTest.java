package com.nubes.cj.basics.bank;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AccountServiceTest {

	private static final String FILE_PATH_ACCOUNTS = "seed_account_data.txt";

	@Test
	public void getAllAcountsTest() {
		AccountService service = new AccountService();
		Account[] accounts = service.getAllAcounts(FILE_PATH_ACCOUNTS);
		assertEquals(3, accounts.length);
		for (Account account : accounts) {
			System.out.println(account.accno + " " + account.name);
		}

	}
}
