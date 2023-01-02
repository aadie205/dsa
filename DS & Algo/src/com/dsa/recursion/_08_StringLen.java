package com.dsa.recursion;
/*
 Given a string calculate length of the string using recursion. 
Examples: 
 

Input : str = "abcd"
Output :4

Input : str = "GEEKSFORGEEKS"
Output :13
 */
public class _08_StringLen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(strLen("Adityafdfd"));
	}
	
	static int strLen(String str) {
		
		if(str.isEmpty())
			return 0;
		
		return strLen(str.substring(1))+1;
	}

}
