package com.dsa.arrays.problems;

class LeetCodeArrays01 {
	public static void main(String args[]) {
		System.out.println(findNumbers(new int[] { 12, 345, 2, 6, 7896 }));

	}

	public static int findNumbers(int[] nums) {
		// nums = [12,345,2,6,7896]
		int evenDigit = 0;

		for (int i = 0; i < nums.length; i++) {
//			System.out.println(evenDigit);

			if (nums[i] >= 0 && nums[i] < 10)
				continue;
			else if (nums[i] >= 10 && nums[i] < 100)
				evenDigit++;
			else if (nums[i] >= 100 && nums[i] < 900)
				continue;
			else if (nums[i] >= 1000 && nums[i] < 10000)
				evenDigit++;
			else if (nums[i] >= 10000 && nums[i] < 100000)
				continue;
			else if (nums[i] >= 100000 && nums[i] < 1000000)
				evenDigit++;
		}
		return evenDigit;
	}
}
