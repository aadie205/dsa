package com.dsa.algos;

import java.util.Scanner;

public class _03_SelectionSort {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter size of the array: ");
		int size=sc.nextInt();
		int ia[]=new int[size];
		
		System.out.print("enter elements of the array: ");
		for(int i=0; i<size; i++) {
			ia[i]=sc.nextInt();
		}
		
		System.out.print("\narray before sorting: ");
		for(int i: ia) {
			System.out.print(i+" ");
		}
		
		int newArr[]=selectionSort(ia);
		
		System.out.print("\narray after sorting: ");
		for(int i: newArr) {
			System.out.print(i+" ");
		}
		

	}
	
	public static int[] selectionSort(int[] ia) {
		for(int i=0;i<ia.length-2;i++) {
			int minIndex=i;
			for(int j=i; j<ia.length;j++) {
				if(ia[j]<ia[minIndex])
					minIndex=j;
			}
			int temp=ia[minIndex];
			ia[minIndex]=ia[i];
			ia[i]=temp;
			
		}
		
		return ia;
	}

}
