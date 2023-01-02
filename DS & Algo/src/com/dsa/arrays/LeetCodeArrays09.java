package com.dsa.arrays;

import java.util.Arrays;

public class LeetCodeArrays09 {

	public static void main(String[] args) {
		int arr[]=new int[] {0,0,1,1,1,2,2,3,3,4};
		System.out.println(removeDuplicatest(arr));
		System.out.println(Arrays.toString(arr));
	}
	public static int removeDuplicatest(int []nums) {
//		Input: nums = [0,0,1,1,1,2,2,3,3,4]
//		Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
		
		if(nums.length<2)
			return nums.length;
		
		int i=0, j=1;
		
		while(j<nums.length) {
			if(nums[i]!=nums[j]) {
				i++;
				nums[i]=nums[j];
			}
			j++;
		}
		return i+1;
	}
}
