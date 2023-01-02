package com.dsa.arrays;

import java.util.Arrays;

/*
Given an integer array nums, move all the even integers 
at the beginning of the array followed by all the odd integers.

Return any array that satisfies this condition.
*/
public class LeetCodeArrays10 {

	public static void main(String[] args) {
		int nums[]=new int[] {3,1,2,4};
		int res[]=sortArrayByParity(nums);
		System.out.println(Arrays.toString(res));
	}

	public static int[] sortArrayByParity(int[] nums) {
//		Input: nums = [3,1,2,4]
//		Output: [2,4,3,1]
//		Explanation: The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.
		
		int i=0, j=nums.length-1;
		
		while(i<j) {
			
			if(nums[i]%2!=0 && nums[j]%2==0) {
				int tmp=nums[i];
				nums[i]=nums[j];
				nums[j]=tmp;
				i++;
				j--;
			}
			if(nums[i]%2==0)
				i++;
			if(nums[j]%2!=0)
				j--;
			
		}
		
		
		return nums;
	}
	
}
