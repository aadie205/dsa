package night.random.jan23;

import java.util.Arrays;

public class LongestCommonPrefix {
	public static void main(String[] args) {
		 StringBuilder sb=new StringBuilder();
		 sb.append("Aditya");
		 sb.append("Yadav");
		 sb.append("Nav");
		 System.out.println(sb.toString());
		 System.out.println( sb.deleteCharAt(2));
		 System.out.println(sb.toString());
		 
		
		String[] str=new String[] {"geeksforgeeks", "geeks", "geek", "geezer"};
//		String[] str=new String[] {"hello", "world"};
//		String res=longestCommonPrefix(str, 4);
//		System.out.println("res: "+res);
		
	}
/* 
 * N = 4
 *	arr[] = {geeksforgeeks, geeks, geek, geezer}
 *        
 */
	static String longestCommonPrefix(String arr[], int n) {
		
		Arrays.sort(arr);
		
		String a=arr[0];
		String b=arr[n-1];
		
		String ans="";
		
		for(int i=0;i<a.length();i++) {
			if(a.charAt(i)==b.charAt(i)) {
				ans+=a.charAt(i);
				continue;
			}
			else
				break;
		}
		
		if(ans.isBlank())
			return -1+"";
		else
			return ans;
		
		
	}
}
