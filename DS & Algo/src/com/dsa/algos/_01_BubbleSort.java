package com.dsa.algos;

import java.util.Arrays;
import java.util.Scanner;

public class _01_BubbleSort {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter size of array: ");
		int no=sc.nextInt();
		int arr[]=new int[no];
		for(int i=0;i<no;i++)
			arr[i]=sc.nextInt();
		
		bubbleSort(arr);
//		Arrays.sort(arr);
//		System.out.println(Arrays.toString(arr));
			

	}
	
	public static void bubbleSort(int... arr) {
//		System.out.println("sort method called");
//		System.out.println(arr.length);
		boolean sorted=true;
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					sorted=false;
				}
			}
			if(sorted)
				break;
		}
		System.out.println(Arrays.toString(arr));
	}
}
