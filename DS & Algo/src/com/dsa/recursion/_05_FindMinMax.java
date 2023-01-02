package com.dsa.recursion;
/* 
	Input: arr = {1, 4, 3, -5, -4, 8, 6};
	Output: min = -5, max = 8

	Input: arr = {1, 4, 45, 6, 10, -8};
	Output: min = -8, max = 45

*/

public class _05_FindMinMax {
	
	static int findMin(int arr[], int n) {
		if(n==1) {
			return arr[0];
		}
		
		return Math.min(arr[n], findMin(arr, n-1));
	}
	static int findMax(int arr[], int n) {
		if(n==1) {
			return arr[0];
		}
		
		return Math.max(arr[n], findMax(arr, n-1));
	}
	
	public static void main(String[] args) {
		int arr[]=new int[] {1,4,6,23,7,-22,-4,0};
		
		System.out.println(findMin(arr, arr.length-1));;
		System.out.println(findMax(arr, arr.length-1));;

	}

}
