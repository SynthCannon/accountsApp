package test;

import static org.junit.Assert.*;

import org.junit.Test;

import account.Account;
import service.Service;

public class ServiceTest {


	@Test
	public void testAddAccount() {
		Service service = new Service();
		System.out.println("Testing add account feature");
		Account rol = new Account("Rol","Wal","1");
		service.addAccount(rol);
		
		assertEquals("Accounts not the same",service.getAccount("1"),rol);
	}
	
	@Test
	public void testRemoveAccount() {
		Service service = new Service();
		System.out.println("Testing remove account feature");
		Account rol = new Account("Rol","Wal","1");
		service.addAccount(rol);
		service.removeAccount(rol.getAccountNum());
		
		assertNotEquals("Account still exists",service.getAccount("1"),rol);
	}
	
	@Test
	public void testToString() {
		System.out.println("Testing toString service feature");
		Service service = new Service();
		service.addDemoAccounts();
		
		assertEquals("toString for service not working",
				"Roland Walet, Account num: 1. "
				+ "John Gordon, Account num: 2. "
				+ "Jeremy Kyle, Account num: 3. "
				+ "Roland Wallet, Account num: 4. ", 
				service.toString());
	}
	
	@Test
	public void testNumOfFirstNames() {
		System.out.println("Testing num of Roland accounts in demo data");
		Service service = new Service();
		service.addDemoAccounts();
		int actualResult = service.searchNumFirstName("Roland");
		assertEquals("number of Rolands not correct", actualResult, 2);
	}
	
}
