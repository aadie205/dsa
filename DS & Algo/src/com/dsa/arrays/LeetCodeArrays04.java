package com.dsa.arrays;

class LeetCodeArrays04 {

	public static void main(String args[]) {

//		System.out.println(removeElement(new int[]{0,1,2,2,3,0,4,2}, 2));
		System.out.println(removeElement(new int[] { 3, 2, 2, 3 }, 3));
	}

	public static int removeElement(int[] nums, int val) {
		// Input: nums = [0,1,2,2,3,0,4,2], val = 2
		// Output: 5, nums = [0,1,4,0,3,_,_,_]

		int i = 0, j = nums.length - 1;

		while (i < j) {
			if (nums[j] == val)
				j--;
			if (nums[i] == val) {
				nums[i] = nums[i] + nums[j];
				nums[j] = nums[i] - nums[j];
				nums[i] = nums[i] - nums[j];
				j--;
			}
			i++;
		}
		return j + 1;

	}
}