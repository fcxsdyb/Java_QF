package Stage_01.Object_Oriented_Practice;

public class Test3 {
	
	public void change1(int i) {
		i = 1234;
	}

	public void change2(BirthDate b) {
		b = new BirthDate(22, 3, 2004);
		System.out.println(b.getMonth());
	}

	public void change3(BirthDate b) {
		b.setDay(22);
	}

	public static void main(String[] args) {
		
		Test3 test = new Test3();
		int date = 9;
		BirthDate d1 = new BirthDate(7, 7, 1970); 
		BirthDate d2 = new BirthDate(1, 1, 2009);
		test.change1(date);
		test.change2(d1);
		test.change3(d2);
		System.out.println("date=" + date);
		d1.display();
		d2.display();
		
	}
	
}