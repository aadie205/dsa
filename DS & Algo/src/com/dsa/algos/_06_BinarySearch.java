package com.dsa.algos;

import java.util.Scanner;

public class _06_BinarySearch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter size of the array: ");
		int size = sc.nextInt();
		int arr[] = new int[size];

		System.out.print("enter elements of the array: ");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.print("\nenter number to search: ");

		int key = sc.nextInt();
		
		int sortedArr[] = _02_Bubble_Sort.bubbleSort(arr);
//		System.out.println(binarySearch1(sortedArr, key));
		System.out.println(binarySearch2(sortedArr, key));
	}

	// recursive implementation
	public static String binarySearch2(int arr[], int key) {
		if (arr.length == 0)
			return "empty array!";
		int left = 0, right = arr.length - 1;
		return recursiveSearch(arr, left, right, key);

	}

	public static String recursiveSearch(int arr[], int left, int right, int key) {
		if(left>right) 
			return "element not found!";
		
		int mid = (left + right) / 2;
		if (arr[mid] == key)
			return "element found at " + mid;
		else if (key < mid)
			return recursiveSearch(arr, left, mid-1, key);
		else
			return recursiveSearch(arr, mid+1, right, key);
	}

	// iterative implementation
	public static String binarySearch1(int arr[], int key) {

		int left = 0;
		int right = arr.length - 1;

		int mid = (left + right) / 2;

		while (left <= right) {
			if (key < arr[mid])
				right = mid - 1;

			else if (arr[mid] == key) {
				return "element found at index: " + mid;
			} else
				left = mid + 1;

			mid = (left + right) / 2;

		}
		return "element not found!";
	}

}
