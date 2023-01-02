package com.dsa.arrays;

import java.util.Arrays;

public class _2D_arrays02 {

	public static void main(String[] args) {
		int arr[][]=new int[][] {{1,2,3},{4,5,6},{7,8,9}};
		
		int res[]=findDiagonalOrder(arr);
		System.out.println(Arrays.toString(res));

	}
	
	public static int[] findDiagonalOrder(int[][] mat) {
        if(mat.length==0 || mat[0].length==0)
            return new int[0];
        
        int m=mat.length, n=mat[0].length;
        int[] arr=new int [m*n];
        int i=0;
        int row=0, col=0;
        
        boolean up=true;
        
        while(row<m && col<n){
            //if diagonal is going up
            if(up){
                while(row>0 && col< n-1){
                    arr[i++]=mat[row][col];
                    row--;
                    col++;
                }
                arr[i++]=mat[row][col];
                if(col==n-1){
                    row++;
                }
                else{
                    col++;
                }
            }
            //or down
            else{
                while(col>0 && row<m-1){
                    arr[i++]=mat[row][col];
                    row++;
                    col--;
                }
                arr[i++]=mat[row][col];
                if(row==m-1)
                    col++;
                else
                    row++;
            }
             up=!up;
        }
       return arr;
            
    }
}
