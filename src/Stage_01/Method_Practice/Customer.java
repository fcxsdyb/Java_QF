package Stage_01.Method_Practice;

public class Customer {

	private String firstName;
	private String lastName;
	private Account account;

	public Customer(String f,String l) {
		this.firstName = f;
		this.lastName = l;
	}
	
	public String getFirstName() {
		return this.firstName;
	}
	
	public String getLastName() {
		return this.lastName;
	}
	
	public Account getAccount() {
		return this.account;
	}
	
	public void setAccount(Account account) {
		this.account = account;
	}
	
	public void show() {
		System.out.println("Customer " + firstName + " " + lastName + " has an account: id is " + 
				account.getId() + ", balance is " + account.getBalance() + ", annualInterestRate is " 
				+ account.getAnnualInterestRate() + "." );
	}

}
