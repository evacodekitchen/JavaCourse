package edu.evacodekitchen.javabasics.bank;

import java.time.LocalDate;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BankTest {

	@Test
	void accountCanBeAddedToBank() {
		// given
		Bank bank = new Bank();

		// when
		bank.addAccount(new Account("Liza Lee", "1234"));

		// then
		int accountsSize = bank.getAccounts().size();
		Assertions.assertEquals(1, accountsSize);
	}
	
	@Test
	void premiumAccountsWithBalanceGreaterThan12000CanBeListed() { 
		//given
		Bank bank = new Bank();
		Account account1 = new Account("Liza Lee", "1234");
		account1.doTransaction(11000, LocalDate.parse("2021-02-18"));
		bank.addAccount(account1);

		Account account2 = new Account("Tom", "12348888");
		account2.doTransaction(15000, LocalDate.parse("2021-02-18"));
		bank.addAccount(account2);

		Account account3 = new Account("Harry", "123467");
		account3.doTransaction(6000, LocalDate.parse("2021-02-18"));
		bank.addAccount(account3);
		
		//when
		List<Account> premiumAccounts = bank.getPremiumAccounts();
		
		//then
		Assertions.assertEquals(1, premiumAccounts.size());
		Assertions.assertEquals(new Account("Tom", "12348888"), premiumAccounts.get(0));
	}
	
}
