package night.hacker_rank.jan23;

import java.util.Arrays;
import java.util.Scanner;

public class SubStringComparision {

	public static String getSmallestAndLargest(String s, int k) {
		String smallest = "";
		String largest = "";

		// Complete the function
		// 'smallest' must be the lexicographically smallest substring of length 'k'
		// 'largest' must be the lexicographically largest substring of length 'k'
		int l = 0;
		if (s.length() % k == 0)
			l = s.length() / k;
		else
			l = s.length() / k + 1;

		String str[] = new String[l];
		int p = 0, j = 0, r = 0;

		for (int i = 0; i < l; i++) {
			r = j;
			j = j + 3;

			if (j >= s.length()) {
				str[p++] = s.substring(r, s.length());
			} else {
				str[p++] = s.substring(r, j);
			}

//	            System.out.println(Arrays.toString(str));
		}
		sort(str);

		smallest = str[0];
		largest = str[str.length - 1];

//	        System.out.println(Arrays.toString(str));

		return smallest + "\n" + largest;
	}
	public static void sort(String[] str) {
		
	}
	public static void main(String[] args) {
//	    	System.out.print("enter string: ");
//	        Scanner scan = new Scanner(System.in);
//	        String s = scan.next();
//	        int k = scan.nextInt();
//	        scan.close();

		String s = "mynameisaditya";
		int k = 3;

		System.out.println(getSmallestAndLargest(s, k));
	}
}