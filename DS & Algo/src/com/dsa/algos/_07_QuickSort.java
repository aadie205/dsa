package com.dsa.algos;

import java.util.Scanner;

public class _07_QuickSort {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("enter size of array: ");
		int a[]=new int[sc.nextInt()];
		
		for(int i=0;i<a.length;i++)
			a[i]=sc.nextInt();
		
		int arr[]=quickSort(a, 0, a.length-1);
		for(int i: arr)
			System.out.print(i+" ");

	}
	
	public static int[] quickSort(int a[], int lb, int ub) {
		if(lb<ub) {
			int loc=partitiion(a, lb, ub);
			quickSort(a, lb, loc-1);
			quickSort(a, loc+1, ub);
		}
		return a;
	}
	
	public static int partitiion(int a[], int lb, int ub) {
		int pivot=a[lb];
		int i=lb;
		int j=ub;
		
		while(i<j ) {
			do {
				i++;
			}while(a[i]<=pivot);
			do {
				j--;
			}while(a[j]>pivot);
			
			if(i < j) {
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
			/* while(start <=ub && arr(start) <= pivot ) start += 1
        while(end >= lb && arr(end) > pivot) end -= 1 */
			
		}
		int temp=a[lb];
		a[lb]=a[ub];
		a[ub]=temp;
		return j;
	}

}

