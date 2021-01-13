package Stage_01;

import java.util.Arrays;

public class test_04 {

	public static void main(String[] args) {

		int[] a = { 2, 7, 11, 15 };
		int target = 9;
		int[] b = twoSum(a, target);
		System.out.println(Arrays.toString(b));

	}

	public static int[] twoSum(int[] nums, int target) {
		int count[] = new int[2];
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != target) {
				count[0] = i;
			}
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[j] == target - nums[count[0]]) {
					count[1] = j;
					break;
				}
			}
			if (count[1] != 0) {
				break;
			}
		}
		return count;
	}
	
}
