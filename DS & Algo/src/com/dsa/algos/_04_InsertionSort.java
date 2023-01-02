package com.dsa.algos;

import java.util.Scanner;

public class _04_InsertionSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter size of the array: ");
		int size = sc.nextInt();
		int ia[] = new int[size];

		System.out.print("enter elements of the array: ");
		for (int i = 0; i < size; i++) {
			ia[i] = sc.nextInt();
		}

		System.out.print("\narray before sorting: ");
		for (int i : ia) {
			System.out.print(i + " ");
		}

		int newArr[] = insertionSort(ia);

		System.out.print("\narray after sorting: ");
		for (int i : newArr) {
			System.out.print(i + " ");
		}

	}

	public static int[] insertionSort(int[] arr) {
		for (int i = 1; i < arr.length ; i++) {
			int key = arr[i];
			int j = i - 1;

			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = key;

		}
		return arr;
	}

}
