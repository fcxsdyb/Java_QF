package Stage_01.Loop_Practice;

public class P9 {

	public static void main(String[] args) {

		int count = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 6 == 0) {
				count++;
			}
		}
		
		System.out.println("The number of multiple of 6 is " + count);

	}

}
