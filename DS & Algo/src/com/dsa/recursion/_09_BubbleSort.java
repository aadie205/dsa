package com.dsa.recursion;

import java.util.Arrays;

public class _09_BubbleSort {

	public static void main(String[] args) {
		int arr[]=new int[] {2,3,5,4,1,7,9,};
		
		
		bubbleSort(arr, arr.length);
		System.out.println(Arrays.toString(arr));
		
		int arr2[]=new int[] {1,0};
		bubbleSort(arr2, arr2.length);
		System.out.println(Arrays.toString(arr2));

	}
	static void bubbleSort(int arr[],int n) {
		if(n==1)
			return;
		
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]>arr[i+1]) {
				int tmp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=tmp;
			}
		}
		bubbleSort(arr, n-1);
	}
}
