package com.dsa.arrays;

import java.util.Arrays;


/*
Leet Code: 1299. Replace Elements with Greatest Element on Right Side
	
	Given an array arr, replace every element in that array with the greatest 
	element among the elements to its right, and replace the last element with -1.

	After doing so, return the array.

*/
public class LeetCodeArrays07 {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(replaceElements(new int[] { 17, 18, 5, 4, 6, 1 })));
		System.out.println(Arrays.toString(replaceElements(new int[] { 400 })));

	}

	public static int[] replaceElements(int[] arr) {
//		Input: arr = [17,18,5,4,6,1]
//		Output: [18,6,6,6,1,-1]

		if (arr == null)
			return arr;

		int n = arr.length; // n=6
		int max = arr[n - 1];
		arr[n - 1] = -1;

		for (int i = n - 2; i >= 0; i--) {
			int tmp = arr[i];

			arr[i] = max;
			if (tmp > max)
				max = tmp;

		}

		return arr;
	}
}

/*
 * public static int[] replaceElements(int[] arr) { // Input: arr =
 * [17,18,5,4,6,1] // Output: [18,6,6,6,1,-1] int maxVal=Integer.MIN_VALUE;
 * 
 * if(arr==null) return arr;
 * 
 * for(int i=0;i<arr.length;i++) { maxVal=arr[arr.length-1]; //
 * System.out.println("maxVal: "+maxVal); for(int j=arr.length-1;j>i;j--) {
 * if(arr[j]>maxVal) maxVal=arr[j]; } //
 * System.out.println("after loop maxVal: "+maxVal); arr[i]=maxVal;
 * if(i==arr.length-1) arr[i]=-1; }
 * 
 * return arr; }
 * 
 */
