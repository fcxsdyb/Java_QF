package Stage_01.Loop_Practice;

public class P3 {

	public static void main(String[] args) {
		
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 3 != 0) {
				System.out.println(i);
				sum += i;
			}
		}
		
		System.out.print("The sum of all the number cannot be exact divided is " + sum);
	}

}
