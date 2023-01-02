package com.dsa.strings;

public class _01_RevStrings {

	public static void main(String[] args) {
		String str = "The sky is  blue";
		Solution.reverseString(str);

	}

}

class Solution {
	public static void reverseString(String str) {
		StringBuilder sb = new StringBuilder();
		
		int i=str.length()-1;
		
		while(i>=0) {
			while(i>=0 && str.charAt(i)==' ')i--;
			
			int j=i;
			
			while(i>=0 &&str.charAt(i)!=' ') i--;
				
			if(sb.length()==0) {
				sb.append(str.substring(i+1, j+1));
			}else {
				sb.append(" "+str.substring(i+1, j+1));
			}
		}
		
		
		System.out.println(sb);
	}
}