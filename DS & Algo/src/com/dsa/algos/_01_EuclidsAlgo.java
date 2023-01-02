package com.dsa.algos;

import java.util.Scanner;

public class _01_EuclidsAlgo{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter first number: ");
		int a=sc.nextInt();
		
		System.out.print("Enter second number: ");
		int b=sc.nextInt();
		
		int res=findGCD(a, b);
		System.out.println("GCD is: "+res); 
	}
	
	static int findGCD(int a, int b) {
		int m=Integer.max(a, b);
		int n=Integer.min(a, b);
		
		int r=m%n;
		
		
		if(r==0)
			return n;
		else {
			m=n;
			n=r;
			return findGCD(m, n);	
		}
			
	}

}
