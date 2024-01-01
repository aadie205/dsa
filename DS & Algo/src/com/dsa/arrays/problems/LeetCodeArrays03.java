package com.dsa.arrays.problems;

import java.util.*;

class LeetCodeArrays03 {

	public static void main(String args[]) {
		int arr[] = new int[] { 1, 0, 2, 3, 0, 4, 5, 0 };

		System.out.println("Before:\t" + Arrays.toString(arr));
		duplicateZeros(arr);

		System.out.println("After:\t" + Arrays.toString(arr));

	}

	public static void duplicateZeros(int[] arr) {
		// Input: arr = [1,0,2,3,0,4,5,0]
		// Output: [1,0,0,2,3,0,0,4]

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				for (int j = arr.length - 2; j >= i; j--) {
					arr[j + 1] = arr[j];
				}

				arr[i] = 0;
				i++;
			}
		}

	}

}