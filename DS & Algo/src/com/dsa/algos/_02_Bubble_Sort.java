package com.dsa.algos;

import java.util.Scanner;

public class _02_Bubble_Sort {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter size of the array:	");
		int size=sc.nextInt();
		int ia[]=new int[size];
		
		System.out.print("enter elements of the array:	");
		for(int i=0; i<size; i++) {
			ia[i]=sc.nextInt();
		}
		
		System.out.print("\narray before sorting:	");
		for(int i: ia) {
			System.out.print(i+" ");
		}
		
//		int newArr[]=bubbleSort(ia);
		int newArr[]=optimezBubbleSort(ia);
		
		System.out.print("\narray after sorting:	");
		for(int i: newArr) {
			System.out.print(i+" ");
		}
		

	}
	public static int[] optimezBubbleSort(int a[]) {
		boolean swapped;
		
		for(int i=0;i<a.length-1;i++) {
			swapped=false;
			for(int j=0;j<a.length-i-1;j++) {
				if(a[j]>a[j+1]) {
					swapped=true;
					int temp = a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
			System.out.println();
			System.err.println("outer loop");
			if(!swapped)
				return a;
		}
		return a;
	}
	
	public static int[] bubbleSort(int[] ia) {
		for(int i=0;i<ia.length-1;i++) {
			for(int j=0; j<ia.length-i-1;j++) {
				if(ia[j]>ia[j+1]) {
					int temp=ia[j];
					ia[j]=ia[j+1];
					ia[j+1]=temp;
				}
			}
		}
		
		return ia;
	}
	
}
