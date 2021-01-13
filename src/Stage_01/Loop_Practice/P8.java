package Stage_01.Loop_Practice;

import java.util.Scanner;

public class P8 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Please input two numbers.");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		
		int max = (num1 >= num2)? num1 : num2;
		int min = (num1 <= num2)? num1 : num2;
		
		for (int i = min; i >= 1; i--) {
			if (num1 % i == 0 && num2 % i == 0) {
				System.out.println("The largest common divisor is " + i);	
				break;
			}
		}
		
		for (int i = max;;i++) {
			if (i % num1 == 0 && i % num2 == 0) {
				System.out.println("The smallest common multiple is " + i);
				break;
			}
		}
		
		
	}

}
