package service;

import java.util.HashMap;

import account.Account;


public class Service {
	/////////////////////////////// Attributes ///////////////////////////////
	private HashMap<String,Account> accounts = new HashMap<String,Account>();

	

	
	/////////////////////////////// Methods ///////////////////////////////
	public void addAccount(Account cAccount) {
		accounts.put(cAccount.getAccountNum(), cAccount);
	}
	
	public Account getAccount(String key) {
		return accounts.get(key);
	}
	
	public void removeAccount(String key) {
		accounts.remove(key); 
	}
	
	public String toString() {
		String rVal = "";
		
		for(String key : accounts.keySet()) {
			rVal+=accounts.get(key).toString() + ". ";
		}
		
		return rVal;
	}
	
	
	public void addDemoAccounts() {
		Account foo = new Account("Roland","Walet","1"),
				foo2 = new Account("John","Gordon","2"),
				foo3 = new Account("Jeremy","Kyle","3"),
				foo4 = new Account("Roland","Wallet","4");
		
		this.addAccount(foo);
		this.addAccount(foo2);
		this.addAccount(foo3);
		this.addAccount(foo4);
	}
	
	public int searchNumFirstName (String name){
		int count = 0;
		for(String key : accounts.keySet()) {
			if(accounts.get(key).getFirstName().equals(name))
				count++;
		}
		
		System.out.println("Number of " + name + "'s is " + count);
		return count;
	}
	
}
