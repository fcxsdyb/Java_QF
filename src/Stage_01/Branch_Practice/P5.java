package Stage_01.Branch_Practice;

import java.util.Scanner;
import java.lang.Long;

public class P5 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Please input the total value of the goods.");
		long tax = Long.parseLong(input.next());
		
		long sum = 0;
		if (tax < 1000) {
			System.out.println("There is no tax at all.");
		}
		else if (tax >= 1000 && tax < 5000) {
			sum = (long) ((tax - 1000) * 0.02);
		}
		else if (tax >= 5000 && tax < 10000) {
			sum = (long) ((tax - 5000) * 0.03 + 80);
		}
		else if (tax >= 10000) {
			sum = (long) ((tax - 10000) * 0.05 + 230);
		}
		
		System.out.println("The tax is " + sum +".");
	}

}
