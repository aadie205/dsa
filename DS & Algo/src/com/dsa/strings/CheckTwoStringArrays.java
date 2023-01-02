package com.dsa.strings;

public class CheckTwoStringArrays {

	public static void main(String[] args) {
		String[] word1 = {"ab", "c"};
		String[] word2={"a", "bc"};
		
		System.out.println(arrayStringsAreEqual(word1, word2));

	}
	  public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
	        StringBuilder sb1=new StringBuilder();
	        StringBuilder sb2=new StringBuilder();
	        
	        for(String st: word1)
	            sb1.append(st);
	        
	        for(String st: word2)
	            sb2.append(st);
	        
//	        System.out.println(sb1.toString());
//	        System.out.println(sb2.toString());
	        return sb1.toString().equals(sb2.toString());
	    }
}
