package com.dsa.strings;

public class LeetCodeStringArrays04 {

	public static void main(String[] args) {
		String s1="Let's take LeetCode contest";
//		String s1="God Ding";
		System.out.println(reverseWords(s1));
		
	}

	public static String reverseWords(String s) {
		String result="";
		int len=s.length();
		s=s.trim();
		int j=0;
		
		for(int i=0;i<len;i++) {
			while(j<s.length() && s.charAt(j)!=' ') {
				j++;
			}
//			System.out.println("result: "+result);
			result+=reversHelper(s.substring(i,j));
			if(j!=s.length())
				result+=" ";
			i=j;
			j++;
		}
		
		return result;
	}
	
	public static String reversHelper(String s) {
		char ch[]=s.toCharArray();
		char[] ch2=new char[ch.length];
		int j=0;
		
		for(int i=s.length()-1;i>=0;i--) {
			ch2[j++]=ch[i];
		}
		return new String(ch2);
	}
}
