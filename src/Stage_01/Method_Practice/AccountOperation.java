package Stage_01.Method_Practice;

public class AccountOperation {

	public static void main(String[] args) {

		Customer a = new Customer("Jane", "Smith");
		Account JaneSmith = new Account(1000,2000,0.0123);
		a.setAccount(JaneSmith); 
		
		JaneSmith.deposit(100);
		System.out.println(JaneSmith.getBalance());
		JaneSmith.withdraw(960);
		System.out.println(JaneSmith.getBalance());
		JaneSmith.withdraw(2000);
		System.out.println(JaneSmith.getBalance());
		a.show();
		
	}

}