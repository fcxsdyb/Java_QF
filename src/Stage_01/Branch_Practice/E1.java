package Stage_01.Branch_Practice;

import java.util.Scanner;

public class E1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Please input the month.(1-12)");
		int month = input.nextInt();
		while (month < 1 || month > 12) {
			System.out.println("Your input is invalid. Please input another one.");
			month = input.nextInt();
		}
	
		System.out.println("Please input the day.(1-31 depending on the specific month)");
		int day = input.nextInt();
		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			if (day < 1 || day > 31) {
				System.out.println("Your input is invalid. Please input another one.");
				day = input.nextInt();
			}
		}
		else if (month == 4 || month == 6 || month == 9 || month == 11) {
			if (day < 1 || day > 30) {
				System.out.println("Your input is invalid. Please input another one.");
				day = input.nextInt();
			}
		}
		else if (month == 2) {
			if (day < 1 || day > 28) {
				System.out.println("Your input is invalid. Please input another one.");
				day = input.nextInt();
			}
		}
		
		int[] month_num = new int[12];
		for (int i = 0; i <= 12; i++) {
			if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12) {
				month_num[i - 1] = 31;
			}
			else if (i == 4 || i == 6 || i == 9 || i == 11) {
				month_num[i - 1] = 30;
			}
			else if (i == 2) {
				month_num[i - 1] = 28;
			}
		}
		
		int count = 0;
		for (int i = 0; i < month - 1; i++) {
			count += month_num[i];
		}
		count += day;
		System.out.println("The " + month + " month and " + day + " day is the " + count + " day in 2014.");
	
	}

}
