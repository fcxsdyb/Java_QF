package Stage_01.Array_Practice;

import java.util.Arrays;

public class P5 {

	public static void main(String[] args) {
		int[] a = new int[] { (int) (Math.random() * 1000), (int) (Math.random() * 1000), 
				(int) (Math.random() * 1000), (int) (Math.random() * 1000), 
				(int) (Math.random() * 1000) };
		System.out.println(a);
		System.out.println(Arrays.toString(a));
		swap(a);
		System.out.println(Arrays.toString(a));
	}

	public static void swap(int a[]) {
		int len = a.length;
		for (int i = 0; i < len / 2; i++) {
			int tmp = a[i];
			a[i] = a[len - 1 - i];
			a[len - 1 - i] = tmp;
		}
	}

}
