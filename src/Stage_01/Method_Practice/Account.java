package Stage_01.Method_Practice;

public class Account {

	private int id;
	private double balance;
	private double annualInterestRate;

	public Account(int id, double balance, double annualInterestRate) {
		this.id = id;
		this.balance = balance;
		this.annualInterestRate = annualInterestRate;
	}
	
	public int getId() {
		return this.id;		
	}
	
	public double getBalance() {
		return this.balance;
	}
	
	public double getAnnualInterestRate() {
		return this.annualInterestRate;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	
	public void withdraw (double amount) {
		if (this.balance - amount < 0 ) {
			System.out.println("This operation is invalid! You do not have so much money.");
		} else {
			this.balance -= amount;
		}
	}
	
	public void deposit (double amount) {
		this.balance += amount;
	}
	
}
