package com.dsa.strings;

import java.util.Arrays;
import java.util.Collections;

public class LeetCodeStringArrays05 {

	public static void main(String[] args) {
//		System.out.println(reverseWords("the sky is blue"));
		System.out.println(reverseWords("a good         example"));
//		System.out.println(reverseWords("hello        word"));

	}

	public static String reverseWords(String s) {
//         Input: s = "the sky is blue"
//         Output: "blue is sky the
		String str[]=s.trim().split(" +");
		Collections.reverse(Arrays.asList(str));

		
		return String.join(" ", str);
	}

}
