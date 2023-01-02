package com.dsa.recursion;

import java.util.Scanner;

public class _02_TowerOfHonai {
	static int count=0;
	public static void main(String[] args) {
		_02_TowerOfHonai obj = new _02_TowerOfHonai();
		
		System.out.print("enter the no of disc to move: ");
		
		obj.move(new Scanner(System.in).nextInt(), 'A', 'C', 'B');
		System.out.println("total steps: "+count);
	}

	public void move(int n, char from, char to, char inter) {
		count++;
		if(n==0)
			return;
		
		
		move(n - 1, from, inter, to);	
		System.out.println("Moving disc " + n + " from " + from + " to " + to);
		move(n - 1, inter, to, from);

	}
}