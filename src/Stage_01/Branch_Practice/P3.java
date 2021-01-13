package Stage_01.Branch_Practice;

import java.util.Scanner;

public class P3 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Please input a letter.");
		char letter = input.next().charAt(0);
		
		if (letter >= 65 && letter <= 90 || letter >= 97 && letter <= 122) {
			System.out.println("Your input is a letter.");
		}
		else {
			System.out.println("Your input is not a letter.");
		}

	}

}
