package night.random.jan23;

import java.util.Arrays;

public class ReverseString {

	public static void main(String[] args) {
//		System.out.println(reverseWords("i.like.this.program.very.much"));
		System.out.println(reverseWords("pqr.mno")); // mno.pqr

	}
	//
	static String reverseWords(String S) {
//		System.out.println(S);
		char[] ch=S.toCharArray();
		
		
		int i=0, j=0;
		
		for(;j<ch.length; j++) {
			if(ch[j]=='.') {
				reverseChars(ch, i, j-1);
				i=j+1;
			}
		}
		reverseChars(ch, i, j-1);
		
		reverseChars(ch, 0, ch.length-1);

		StringBuilder sb=new StringBuilder();
		for(char c: ch) {
			sb.append(c);
		}
		
		
		return sb.toString();
	}
	
	static void reverseChars(char[] ch, int s, int e) {
		while(s<e) {
			char tmp=ch[s];
			ch[s]=ch[e];
			ch[e]=tmp;
			s++;
			e--;
		}
	}
}
