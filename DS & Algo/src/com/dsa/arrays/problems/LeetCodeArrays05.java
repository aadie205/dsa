package com.dsa.arrays.problems;

import java.util.HashSet;
import java.util.Set;

//Leetcode 1346
public class LeetCodeArrays05 {

	public static void main(String[] args) {
		System.out.println(checkIfExist(new int[] { -2, 0, 10, -19, 4, 6, -8 })); // false
//		System.out.println(checkIfExist(new int[] {10,5,-9,15,3,8,12,-10}));

//		System.out.println(checkIfExist(new int[] {0,0})); //true

	}
	
	public static boolean checkIfExist(int[] arr) {
		/*
		 * for(int i=0;i<arr.length;i++){ for(int j=0;j<arr.length;j++){
		 * System.out.println("i: "+arr[i]+ "\tj: "+arr[j]); if(i==j) continue;
		 * if(arr[j]==0 && arr[i]==0) return true; if(arr[j]==arr[i]*2 && arr[i]!=0)
		 * return true; } }
		 */
		Set<Integer> visited = new HashSet<>();
		
		for(int i: visited) {
			if(visited.contains(i*2) || (i%2==0 && visited.contains(i/2)))
				return true;
			visited.add(i);
		}
		return false;
	}

}
