package com.dsa.recursion;
/*
 Given a string find its first uppercase letter
Examples : 

Input : geeksforgeeKs
Output : K

Input  : geekS
Output : S
 
 */
public class _07_FirstUpperCase {

	public static void main(String[] args) {
		String str="My name is Aditya";
		String str2="my name is Aditya";
		String str3="geekS";
		
		System.out.println(findFirst(str, 0));
		System.out.println(findFirst(str2, 0));
		System.out.println(findFirst(str3, 0));
	}
	static int findFirst(String str, int i) {
		if(str.equals(null)|| i>=str.length())
			return -1;
		
		if(Character.isUpperCase(str.charAt(i)))
			return i;
		
		return findFirst(str, i+1);
	}
}
