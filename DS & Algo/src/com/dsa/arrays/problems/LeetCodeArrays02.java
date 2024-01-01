package com.dsa.arrays.problems;

import java.util.*;

class LeetCodeArrays02 {
	
	public static void main(String args[]){
		int res[]=sortedSquares(new int[]{-4,-1,0,3,10});

		System.out.println(Arrays.toString(res));
	}



    public static int[] sortedSquares(int[] nums) {
        
        int arr[]=new int[nums.length];
        
        for(int i=0;i<nums.length;i++){

            arr[i]=(int)Math.pow(Math.abs(nums[i]),2);
        }
        Arrays.sort(arr);
        return arr;
    }
}