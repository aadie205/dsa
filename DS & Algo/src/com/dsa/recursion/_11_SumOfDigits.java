package com.dsa.recursion;
/*
 	Given a number, we need to find sum of its digits using recursion.
	Examples: 
 

	Input : 12345
	Output : 15

	Input : 45632
	Output :20
 
 */
public class _11_SumOfDigits {

	public static void main(String[] args) {
		System.out.println(sumOfDigits(12345));
		System.out.println(sumOfDigits(45632));

	}

	private static int sumOfDigits(int n) {
		if(n<=0)
			return 0;
		return n%10 + sumOfDigits(n/10);
	}

}
