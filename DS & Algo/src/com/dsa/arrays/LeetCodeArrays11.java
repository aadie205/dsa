package com.dsa.arrays;

import java.util.Arrays;

public class LeetCodeArrays11 {

	public static void main(String[] args) {
		System.out.println(heightChecker(new int[] {1,1,4,2,1,3}));
	}
	public static int heightChecker(int[] heights) {
        int expected[]=new int[heights.length];
        System.arraycopy(heights, 0, expected	, 0, heights.length);
        
        Arrays.sort(expected);
        System.out.println("heights: "+Arrays.toString(heights));
        System.out.println("heights: "+Arrays.toString(expected));

        int count=0;
        for(int i=0;i<heights.length;i++){
            if(heights[i]!=expected[i])
                count++;
        }
        
        return count;
    }
}
