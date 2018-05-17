package main;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import service.Service;
import account.Account;

public class Main {
	
	public static void main(String[] args) {
		ObjectMapper mapper = new ObjectMapper();
		Service service = new Service();
		Account acc = new Account("gg","uu","88");
		String jsonInString = "";
		
		service.addDemoAccounts();
		
		//System.out.println(acc.toString());
		
		
//		try {
//			jsonInString = mapper.writeValueAsString(service.getAccount("1"));
//			
//		} catch (JsonProcessingException e) {
//			e.printStackTrace();
//		}
//		
//		System.out.println(jsonInString);
//		
		
		// Use GSON instead, and within class
		try {
			jsonInString = mapper.writeValueAsString(acc);
			Account acc2 = mapper.readValue(jsonInString, Account.class);
			System.out.println(acc2.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
}
