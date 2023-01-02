package com.dsa.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class _2D_arrays01 {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int arr[][]=new int[3][4];
//		
		System.out.println("enter matrix elements: ");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("printing matrix");
		printMatrix(arr);
	}
	
	static void printMatrix(int arr[][]) {
		for(int i[]:arr) {
			System.out.println(Arrays.toString(i));
		}
	}
}
