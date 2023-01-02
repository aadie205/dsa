package com.dsa.algos;

import java.util.Arrays;
import java.util.Scanner;

public class _02_SelectionSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter size of array: ");
		int no = sc.nextInt();
		int arr[] = new int[no];
		for (int i = 0; i < no; i++)
			arr[i] = sc.nextInt();

		selectionSort(arr);
	
	}
	
	public static void selectionSort(int... arr) {
		
		for (int i = 0; i < arr.length - 1; i++) {
			int minIndex=i;
			for (int j = i; j < arr.length; j++) {
				if (arr[j] < arr[minIndex]) {
					minIndex=j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;
		}
		System.out.println(Arrays.toString(arr));
	}

}
