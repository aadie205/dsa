package com.dsa.searching;

public class _01_LinearSearch {

	public static void main(String[] args) {
		System.out.println(linearSearch(new int[] {1, 2,4,3,6,7}, 3));
	}
	static int linearSearch(int[] arr, int key) {
		if(arr.length==0)
			return -1;
		
		for(int i: arr){
			if(i==key)
				return i;
		}
		return -1;
	}
} 
