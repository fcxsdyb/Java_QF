package Stage_01.Method_Practice;

public class NetworkUser {
	
	int Userid;
	String password;
	String email;
	
	public NetworkUser(int id, String password) {
		this.Userid = id;
		this.password = password;
		this.email = "" + id + "@gameschool.com";
	}
	
	public NetworkUser(int id, String password, String email) {
		this.Userid = id;
		this.password = password;
		this.email = email;
	}

	public static void main(String[] args) {

		NetworkUser a = new NetworkUser(123,"dfd343");
		System.out.println(a.email);
		
	}

}
