package service;

import java.util.HashMap;

import accounts.Account;


public class Service {
	/////////////////////////////// Attributes ///////////////////////////////
	private HashMap<String,Account> accounts = new HashMap<>();
	
	
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
			rVal+=accounts.get(key).toString() + "\n";
		}
		
		return rVal;
	}
	
	
	public void addDemoAccounts() {
		Account foo = new Account("Roland","Walet","1"),
				foo2 = new Account("John","Gordon","2"),
				foo3 = new Account("Jeremy","Kyle","3");
		
		addAccount(foo);
		addAccount(foo2);
		addAccount(foo3);
	}
	
}
