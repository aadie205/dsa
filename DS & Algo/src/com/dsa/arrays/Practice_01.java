package com.dsa.arrays;

import java.util.Arrays;

//Copying an array in java { using clone(), arraycopy() }

public class Practice_01 {

	public static void main(String[] args) {
		int[] array=new int[]{10,20,30,40,50};
		
		
		System.out.println(Arrays.toString(copyarray(array)));
//		System.out.println(Arrays.toString(array));
	}
	private static int[] copyarray(int[] array) {
		int[] array2=array.clone();
		
		
		int[] array3=new int[array.length+5];
		System.arraycopy(array, 1, array3, 2, array.length-1);
		
		array[3]=100;
		
		return array3;
	}
}
