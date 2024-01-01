package com.dsa.arrays.problems;

//LeetCode941
public class LeetCodeArrays06 {

	public static void main(String[] args) {
		System.out.println(validMountainArray(new int[] {2,1}));	//false
		System.out.println(validMountainArray(new int[] {3,5,5}));	//false
		System.out.println(validMountainArray(new int[] {0,3,2,1}));	//true
		System.out.println(validMountainArray(new int[] {1,7,9,5,4,1,2}));	//false
	}
	 public static boolean validMountainArray(int[] arr) {
		 int maxValIndx=0;
	        
	        for(int i=0;i<arr.length;i++){
	           if(arr[i]>arr[maxValIndx])
	               maxValIndx=i;
	            
	        }
	       if(maxValIndx==0 || maxValIndx==arr.length-1)
	    	   return false;
	       
	        for(int i=maxValIndx; i>0;i--){
	            if(arr[i-1]<arr[i])
	                continue;
	            else
	                return false;
	        }
	        for(int i=maxValIndx;i<arr.length-1;i++){
	            if(arr[i]>arr[i+1])
	                continue;
	            else
	                return false;
	        }
	        return true;
	 }
}

/*
//2nd solution
 

class Solution {
    public boolean validMountainArray(int[] A) {
        int N = A.length;
        int i = 0;

        // walk up
        while (i+1 < N && A[i] < A[i+1])
            i++;

        // peak can't be first or last
        if (i == 0 || i == N-1)
            return false;

        // walk down
        while (i+1 < N && A[i] > A[i+1])
            i++;

        return i == N-1;
    }
}

*/