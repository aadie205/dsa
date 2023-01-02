package com.dsa.strings;
//Find Pivot Index

/*
Given an array of integers nums, calculate the pivot index of this array.

The pivot index is the index where the sum of all the numbers strictly to 
the left of the index is equal to the sum of all the numbers strictly to the index's right.

If the index is on the left edge of the array, then the left sum is 0 because there are no 
elements to the left. This also applies to the right edge of the array.

Return the leftmost pivot index. If no such index exists, return -1.

*/

public class LeetCodeStringArray01 {

	public static void main(String[] args) {
		System.out.println(pivotIndex(new int[] {1,7,3,6,5,6}));
	}

	public static int pivotIndex(int[] nums) {
//		Input: nums = [1,7,3,6,5,6]
//		Output: 3
		
	
		int total = 0, sum = 0;
		        for (int num : nums) total += num;
		        for (int i = 0; i < nums.length; sum += nums[i++])
		            if (sum * 2 == total - nums[i]) return i;
		        return -1;  
	}
}
