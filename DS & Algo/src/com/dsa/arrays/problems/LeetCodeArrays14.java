package com.dsa.arrays.problems;

public class LeetCodeArrays14 {

	public static void main(String[] args) {
		System.out.println(dominantIndex(new int[] {3,6,1,0})); //1
		System.out.println(dominantIndex(new int[] {1,2,3,4})); //-1
		System.out.println(dominantIndex(new int[] {0,0,0,1}));  //3
		
	}
//	Input: nums = [3,6,1,0]
//			Output: 1
	
	public static int dominantIndex(int[] nums) {
        int max=Integer.MIN_VALUE;
        int len=nums.length;
        int indx=0;
        
        if(len<=1)
            return 0;
        
        for(int i=0;i<len-1;i++){
            if(nums[i]>max)
                max=nums[i];
                indx=i;
        }
        System.out.println("max: "+max);
        for(int i=0;i<len-1;i++){
        	if(nums[i]== max )
        		continue;
            if(nums[i]*2 <=max)
                continue;
            else
                return -1;
        }
//        System.out.println("kjk");
        return indx-1;
        
    }
}
