package Stage_01.Object_Oriented_Practice;

public class Zoo {

	String name;
	String address;
	double ticket;
	int num;
	
	public Zoo(String name, String address, double ticket, int num) {
		this.name = name;
		this.address = address;
		this.ticket = ticket;
		this.num = num;
	}
	
	public void addNum(int a) {
		this.num += a;
	}
	
	public void subNum(int a) {
		this.num -= a;
	}
}
