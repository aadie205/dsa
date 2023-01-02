package com.dsa.recursion;

import java.util.Scanner;

public class _04_BinarySearchRecursion {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[] {2,5};
		System.out.println("1,2,4,5,7,11,44,67,99");
		System.out.print("enter number to search: ");
		int key=sc.nextInt();
		
		System.out.println(binarySearch(arr, key));
	}
	
	static boolean binarySearch(int arr[],int key) {
		int start=0;
		int end=arr.length-1;
		return binarySearchHelper(arr, key, start, end);
	}
	
	static boolean binarySearchHelper(int arr[], int key, int start, int end) {
		int mid=(start+end)/2;
		
		if(arr[mid]==key)
			return true;
		if(start>=end)
			return false;
		
		else if(key>arr[mid]) {
			start=mid+1;
			return binarySearchHelper(arr, key, start, end);
		}
		else if(key<arr[mid]) {
			end=mid-1;
			return binarySearchHelper(arr, key, start, end);
		} 
		else
			return false;	
	}

}
