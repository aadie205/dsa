package com.dsa.set;

import java.util.TreeSet;

public class _01_IsPanagram {

	public static void main(String[] args) {
		String str="The quick brown fox jumps over a lazy dog";
		System.out.println(isPanagram(str));
	}
	
	public static boolean isPanagram(String str) {
		str=str.toUpperCase();
		char ch[]=str.toCharArray();
//		LinkedHashSet lhs=new LinkedHashSet();
//		HashSet lhs=new HashSet();
		TreeSet lhs=new TreeSet();
		
		for(int i=0;i<ch.length;i++) {
			if(ch[i]>=65 && ch[i]<=92) {
				lhs.add(ch[i]);
			}
		}
		System.out.println(lhs);
		if(lhs.size()==26) return true;
		else return false;
	}

}
