package account;

public class Account {
	/////////////////////////////// Attributes ///////////////////////////////
	private String firstName, lastName, accountNum;

	/////////////////////////////// Constructor ///////////////////////////////
	public Account(String cFirstName, String cLastName, String cAccountNum) {
		this.firstName = cFirstName;
		this.lastName = cLastName;
		this.accountNum = cAccountNum;
	}
	
	public Account() {
		
	}
	
	
	/////////////////////////////// Methods ///////////////////////////////
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAccountNum() {
		return accountNum;
	}

	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}
	
	public String toString() {
		return this.getFirstName() + " " + this.getLastName() + ", Account num: " + this.getAccountNum();
	}
	
	
}
