package Stage_01.Loop_Practice;

public class P10 {

	public static void main(String[] args) {

		int day = 0;
		
		for (int i = 3000; i >= 5; i /= 2) {
			day++;
		}
		
		System.out.print("The total day of cut down is " + day);

	}

}
