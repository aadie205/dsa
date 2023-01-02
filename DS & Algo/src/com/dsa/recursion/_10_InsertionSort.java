package com.dsa.recursion;

import java.util.Arrays;

public class _10_InsertionSort {

	public static void main(String[] args) {
		int arr[] = new int[] { 2, 3, 5, 4, 1, 7, 9, };

		insertionSort(arr, arr.length);
		System.out.println(Arrays.toString(arr));

		int arr2[] = new int[] { 1, 0 };
		insertionSort(arr2, arr2.length);
		System.out.println(Arrays.toString(arr2));
	}

	public static void insertionSort(int[] arr, int n) {
		if (n <= 1)
			return;

		insertionSort(arr, n - 1);

		int key = arr[n - 1];
		int j = n - 2;

		while (j >= 0 && arr[j] > key) {
			arr[j + 1] = arr[j];
			j--;
		}
		arr[j + 1] = key;
	}

}
