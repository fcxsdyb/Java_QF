package Stage_01.Loop_Practice;

import java.util.Scanner;

public class Array_Count {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String num = input.next();
		int arr[] = countbit(num);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

	public static int[] countbit(String a) {
		int cou[] = new int[a.length()];
		int num = Integer.parseInt(a);

		for (int i = 0; i < a.length(); i++) {
			cou[i] = num % 10;
			num /= 10;
		}

		return cou;
	}

}
