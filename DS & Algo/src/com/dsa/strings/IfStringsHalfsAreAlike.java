package com.dsa.strings;

public class IfStringsHalfsAreAlike {

	public static void main(String[] args) {
		String s = "book";
		String s2="textbook";
		
		System.out.println(halvesAreAlike(s));
		System.out.println(halvesAreAlike(s2));
		
	}
	
	public static  boolean halvesAreAlike(String s) {
        int len=s.length()/2;
        
        return countVowels(s.substring(0, len))==countVowels(s.substring(len, s.length()));
        
	}
	static int countVowels(String st) {
		int count=0;
	
		for(int i=0;i<st.length();i++) {
			char c=st.charAt(i);
			
			if(c=='a'||c=='e'||c=='i'|| c=='o'|| c=='u'||c=='A'||c=='E'||c=='I'|| c=='O'|| c=='U')
				count++;
		}
		return count;
	}
}
