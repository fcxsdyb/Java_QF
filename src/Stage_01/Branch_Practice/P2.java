package Stage_01.Branch_Practice;

import java.util.Scanner;

public class P2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Please input the year.");
		int year = input.nextInt();
		while (year < 0) {
			System.out.println("Your input is invalid. Please input another one.");
			year = input.nextInt();
		}
		
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
			if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
				if (day < 1 || day > 29) {
					System.out.println("Your input is invalid. Please input another one.");
					day = input.nextInt();
				}
			}
			else if (day < 1 || day > 28) {
				System.out.println("Your input is invalid. Please input another one.");
				day = input.nextInt();
			}
		}
		
		int count = 0;
		switch (month) {
		case 12:
			count += 30;
			
		case 11:
			count += 31;
			
		case 10:
			count += 30;
			
		case 9:
			count += 31;
		
		case 8:
			count += 31;
		
		case 7:
			count += 30;
		
		case 6:
			count += 31;
			
		case 5:
			count += 30;
		
		case 4:
			count += 31;
		
		case 3:
			if (year % 4 == 0 & year % 100 != 0 || year % 400 == 0) {
				count += 29;
			}
			else {
				count += 28;
			}
			
		case 2:
			count += 31;
			
		case 1:
			count += day;
		}
		
		System.out.println("The " + month + " month and " + day + " day is the " + count + " day in " + year +".");

	}

}
