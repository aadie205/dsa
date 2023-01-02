package com.dsa.algos;

import java.util.Arrays;
import java.util.Scanner;

/*
 Find a triplet that sum to a given value (GOG)
 */
public class _09_TwoPointersAlgo {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.print("enter size of array: ");
		int n=scn.nextInt();
		int arr[]=new int[n];
		System.out.print("enter items in array: ");
		for(int i=0;i<arr.length;i++) {
			arr[i]=scn.nextInt();
		}
		System.out.print("enter sum: ");
		int sum=scn.nextInt();
//		findTriplets1(arr,sum);
		findTriplets2(arr,sum);
	}
	
	
//	intutitive algorithm
//	takes O(n^3)
	public static void findTriplets1(int arr[],int sum) {
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				for(int k=j+1;k<arr.length;k++) {
					if(arr[i]+arr[j]+arr[k]==sum) {
						System.out.println("triplets found: "+arr[i]+"+"+arr[j]+"+"+arr[k]);
						return;
					}
				}
			}
		}
		System.out.println("no triplets found!");
	}
	
//	Two pointers algorithm
//	takes O(n^2)
	public static void findTriplets2(int arr[],int sum) {
		//sorting array
		Arrays.sort(arr);
		
		//to fix one item
		for(int i=0;i<arr.length;i++) {
			int newSum=sum-arr[i];
			int j=i+1;
			int k=arr.length-1;
			while(j<k) {
				if(arr[j]+arr[k]==newSum) {
					System.out.println("triplets found: "+arr[i]+"+"+arr[j]+"+"+arr[k]);
					return;
				}
				else if(arr[j]+arr[k]<newSum)
					j++;
				else
					k--;
			}
		}
		System.out.println("triplets not found!");
		
	}

}
