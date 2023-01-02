package com.dsa.strings;

import java.util.Arrays;

//Longes common prefix
public class LeetCodeStringArray03 {

	public static void main(String[] args) {
//		System.out.println(longestCommonPrefix(new String[] {"flower","flow","flight"}));
//		System.out.println(longestCommonPrefix(new String[] {"dog","racecar","car"}));
//		System.out.println(longestCommonPrefix(new String[] {"car","racecar","car","car"}));
		System.out.println(longestCommonPrefix(new String[] {"geeksforgeeks", "geeks", "geek", "geezer"}));
	}
	
//		Input: strs = ["flower","flow","flight"]
//		Output: "fl"
		
//	["dog","racecar","car"]
//
	public static String longestCommonPrefix(String[] strs) {
		int size = strs.length;
        Arrays.sort(strs);
       
        String a = strs[0];
        String b = strs[size-1];
        String ans = "";
        
        for(int i=0; i<a.length(); i++) {
            
            if(a.charAt(i) == b.charAt(i))
                ans += a.charAt(i);
            
            else
                break;
        }
        
        return ans;
	}
}
