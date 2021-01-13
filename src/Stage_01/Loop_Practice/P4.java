package Stage_01.Loop_Practice;

import java.util.Scanner;

public class P4 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Please input the length.");
		int length = input.nextInt();
		System.out.println("Please input the width.");
		int width = input.nextInt();
		
		for (int i = 1; i <= width; i++) {
			for (int j = 1; j <= length; j++) {
				System.out.print(" # ");
			}
			System.out.println();
		}
		
	}

}
