package Stage_01.Loop_Practice;

import java.util.Scanner;

public class P6 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Please input the height.");
		int height = input.nextInt();
		
		for (int i = 1; i <= height; i++) {
			for (int j = i; j <= height; j++) {
				System.out.print(" # ");
			}
			System.out.println();
		}

	}

}
