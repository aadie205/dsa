package com.dsa.strings;

import java.util.Arrays;

public class LeetCodeStringArray02 {

	public static void main(String[] args) {

		int input1[] = plusOne(new int[] { 1, 2, 3 }); // [1,2,4]
//		int input2[] = plusOne(new int[] { 4, 3, 2, 1 }); // [4,3,2,2]
		int input3[] = plusOne(new int[] { 9 }); // [1,0]
		int input4[] = plusOne(new int[] { 9,8,7,6,5,4,3,2,1,0 }); //[9,8,7,6,5,4,3,2,1,1]

		System.out.println(Arrays.toString(input1));
//		System.out.println(Arrays.toString(input2));
		System.out.println(Arrays.toString(input3));
		System.out.println(Arrays.toString(input4));

	}
//	Input: digits = [1,2,3] // 123 +1 = 124
//			Output: [1,2,4]

	public static int[] plusOne(int[] digits) {
		
		
		for(int i=digits.length-1;i>=0;i--) {				
			if(digits[i]<9) {
				digits[i]++;
				return digits;
			}
			else
				digits[i]=0;
				
		}
		int arr[]=new int[digits.length+1];
		arr[0]=1;
		return arr;
	}
}
