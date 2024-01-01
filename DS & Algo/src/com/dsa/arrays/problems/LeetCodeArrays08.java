package com.dsa.arrays.problems;

import java.util.Arrays;

/*
Leet Code 283. Given an integer array nums, move all 0's to the end of it while 
maintaining the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array.

*/
public class LeetCodeArrays08 {

	public static void main(String[] args) {
		int arr[] = new int[] { 0, 1, 0, 3, 12 };
		int arr2[]=new int[] {0,0,1};
		System.out.println("before calling metnod: " + Arrays.toString(arr));
		moveZeros(arr);
		System.out.println("after calling method: " + Arrays.toString(arr));
		System.out.println("2nd test");
		moveZeros(arr2);
		System.out.println(Arrays.toString(arr2));
	}

	public static void moveZeros(int[] nums) {
//		Input: nums = [0,1,0,3,12]
//		Output: [1,3,12,0,0]
		
		 int i=0,j=0;
	        
	        for(;i<nums.length;i++){
	            if(nums[i]!=0){
	                int tmp=nums[i];
	                nums[i]=nums[j];
	                nums[j]=tmp;
	                j++;
	            }
	        }
		
	}
}

/*
int j = 1;

for (int i = 0; i < nums.length; i++) {
	if(nums[i]==0) {
		j=i;
		while(j<nums.length-1) {
			if(nums[j]==0) {
				j++;
				continue;
			}
			break;
		}
		int tmp=nums[i];
		nums[i]=nums[j];
		nums[j]=tmp;
	}
}
*/