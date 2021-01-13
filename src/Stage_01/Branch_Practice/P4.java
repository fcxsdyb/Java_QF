package Stage_01.Branch_Practice;

import java.util.Scanner;

public class P4 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Please input some words.");
		String initial = input.next();
		
		String upper = initial.toUpperCase();
		String lower = initial.toLowerCase();
		
		System.out.println(upper);
		System.out.println(lower);
		
	}

}
