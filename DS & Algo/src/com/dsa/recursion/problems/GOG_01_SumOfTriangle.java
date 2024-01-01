package com.dsa.recursion.problems;

import java.util.Arrays;

/* 
Input : A = {1, 2, 3, 4, 5}
Output : [48]
         [20, 28] 
         [8, 12, 16] 
         [3, 5, 7, 9] 
         [1, 2, 3, 4, 5] 

Explanation :
Here,   [48]
        [20, 28] -->(20 + 28 = 48)
        [8, 12, 16] -->(8 + 12 = 20, 12 + 16 = 28)
        [3, 5, 7, 9] -->(3 + 5 = 8, 5 + 7 = 12, 7 + 9 = 16)
        [1, 2, 3, 4, 5] -->(1 + 2 = 3, 2 + 3 = 5, 3 + 4 = 7, 4 + 5 = 9)

 */
public class GOG_01_SumOfTriangle {
	
	static void sumOfArray(int arr[]) {
		if(arr.length<1)
			return;
		
		int k=0;
		int arr2[]=new int[arr.length-1];
		
		for(int i=0;i<arr.length-1;i++) {
			arr2[k++]=arr[i]+arr[i+1];
		}
		
		sumOfArray(arr2);;
		
		System.out.println(Arrays.toString(arr));
	}
	
	public static void main(String[] args) {
		int arr[]=new int[] {1,2,3,4,5,};
		
		sumOfArray(arr);

	}

}
