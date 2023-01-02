package com.dsa.algos;

import java.util.Scanner;

public class _05_LinearSearch {

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
		
		int key=sc.nextInt();
		linearSearch(arr, key);
	}
	
	public static void linearSearch(int arr[], int key) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==key) {
				System.out.println("element found at index: "+i);
				return;
			}
		}
		System.out.println("element not found!");
	}

}
