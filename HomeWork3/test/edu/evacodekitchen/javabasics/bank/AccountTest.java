package edu.evacodekitchen.javabasics.bank;

import java.time.LocalDate;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AccountTest {

	@Test
	void newAccountBalanceIsZero() {
		// given
		Account account = new Account("Liza Lee", "1234");

		// when
		int balance = account.getBalance();
		
		//then
		Assertions.assertEquals(0, balance);
	}
	
	@Test
	void moneyReceiverTransactionShouldModifyTheBalance() {
		// given
		Account account = new Account("Liza Lee", "1234");

		// when
		account.doTransaction(350, LocalDate.parse("2021-02-18"));
		account.doTransaction(150, LocalDate.parse("2021-02-18"));
		
		//then
		Assertions.assertEquals(500, account.getBalance());
	}

	@Test
	void moneyTransferTransactionShouldModifyTheBalance() {
		// given
		Account account = new Account("Liza Lee", "1234");
		account.doTransaction(350, LocalDate.parse("2021-02-18"));
		
		// when
		account.doTransaction(-100, LocalDate.parse("2021-02-20"));
		
		//then
		Assertions.assertEquals(250, account.getBalance());
	}

	@Test
	void moneyTransferTransactionShouldThrowExceptionWhenBalanceIsTooLow() {
		// given
		Account account = new Account("Liza Lee", "1234");
		account.doTransaction(5, LocalDate.parse("2021-02-18"));
		
		// then
		Assertions.assertThrows(TooLowBalanceException.class, () -> account.doTransaction(-10, LocalDate.parse("2021-02-23")));
	}
	
	@Test
	void shouldListAllTransactionsForAGivenDay() {
		//given
		Account account = new Account("Liza Lee", "1234");
		account.doTransaction(5, LocalDate.parse("2021-02-18"));
		account.doTransaction(10, LocalDate.parse("2021-02-19"));
		account.doTransaction(20, LocalDate.parse("2021-02-19"));
		account.doTransaction(1, LocalDate.parse("2021-02-19"));
		
		//when
		List<Transaction> transactions = account.getTransactionsFor(LocalDate.parse("2021-02-19"));
		
		//then
		Assertions.assertEquals(3, transactions.size());
		Assertions.assertEquals(LocalDate.parse("2021-02-19"), transactions.get(0).getDate());
		Assertions.assertEquals(LocalDate.parse("2021-02-19"), transactions.get(1).getDate());
		Assertions.assertEquals(LocalDate.parse("2021-02-19"), transactions.get(2).getDate());
	}

}
