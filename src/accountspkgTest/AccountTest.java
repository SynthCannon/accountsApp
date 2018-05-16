package accountspkgTest;

import static org.junit.Assert.*;

import org.junit.Test;

import accountspkg.Account;

public class AccountTest {

	
	@Test
	public void testFirstName() {
		System.out.println("testing first name getter and setter");
		
		Account acc = new Account("nn","mm","22");
		assertEquals("first name getter not working",acc.getFirstName(),"nn");
		
	}
	
	@Test
	public void testLastName() {
		System.out.println("testing last name getter and setter");
		
		Account acc = new Account("nn","mm","22");
		assertEquals("last name getter not working",acc.getLastName(),"mm");
	}
	
	@Test
	public void testAccountNum() {
		System.out.println("testing account number getter and setter");
		
		Account acc = new Account("nn","mm","22");
		assertEquals("account number getter not working",acc.getAccountNum(),"22");
	}
	
	@Test
	public void testToString() {
		System.out.println("testing account toString");
		
		Account acc = new Account("nn","mm","22");
		assertEquals("toString for account not working","nn mm, Account num: 22", acc.toString());
	}
	
}
