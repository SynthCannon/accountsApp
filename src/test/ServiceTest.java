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
				"Roland Walet, Account num: 1\n"
				+ "John Gordon, Account num: 2\n"
				+ "Jeremy Kyle, Account num: 3\n", 
				service.toString());
	}
	
}
