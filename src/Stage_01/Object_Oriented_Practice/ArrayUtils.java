package Stage_01.Object_Oriented_Practice;

import java.util.Arrays;

public class ArrayUtils {

	/**
	 * 返回数组最大值
	 * 
	 * @param a int型数组
	 * @return int最大值
	 */
	public int maxArray(int[] a) {
		Arrays.sort(a);
		return a[a.length - 1];
	}

	public int minArray(int[] a) {
		Arrays.sort(a);
		return a[0];
	}

	public int[] sort(int[] a) {
		Arrays.sort(a);
		return a;
	}

	public int[] newArray(int[] a, int[] b) {
		int[] c = new int[a.length + b.length];
		System.arraycopy(a, 0, c, 0, a.length);
		System.arraycopy(b, 0, c, a.length, b.length);
		return c;
	}

	public boolean isKey(int[] a, int key) {
		Arrays.sort(a);
		int b = Arrays.binarySearch(a, key);
		return (b > 0) ? true : false;
	}

	public static void main(String[] args) {
		ArrayUtils au = new ArrayUtils();
		int[] a = { 1, 2, 3 };
		int[] b = { 4, 5, 6 };
		int max = au.maxArray(a);
		System.out.println(max);
		int[] c = au.newArray(a, b);
		System.out.println(Arrays.toString(c));
	}

}
