package Stage_01.Array_Practice;

import java.util.Arrays;

public class P7 {

	public static void main(String[] args) {

		int a[] = { 7, 9, 1, 11, 15, 19, 17, 13 };
		Arrays.sort(a);
		int b[] = { 2, 4, 6, 8, 10 };
		int c[] = new int[a.length + b.length];

		int i = 0;
		int j = 0;
		int count = 0;
		
		while (count < c.length) {
			while (i < a.length && j < b.length) {
				if (a[i] < b[j]) {
					c[count] = a[i];
					i++;
					count++;
				} else {
					c[count] = b[j];
					j++;
					count++;
				}
			}
			
			while (i < a.length) {
				c[count] = a[i];
				count++;
				i++;
			}
			
			while (j < b.length) {
				c[count] = b[j];
				count++;
				j++;
			}
			
		}

		for (int k : c) {
			System.out.println(k);
		}
	}

}
