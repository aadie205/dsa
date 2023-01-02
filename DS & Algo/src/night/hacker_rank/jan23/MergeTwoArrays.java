package night.hacker_rank.jan23;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MergeTwoArrays {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int arr[] = { 2, 5, 4, 6, 8, 7, 9 };
		int arr2[] = { 3, 5, 7, 6, 2, 3, 8 };

		Arrays.sort(arr);
		Arrays.sort(arr2);
		List l1 = (List) Arrays.asList(arr);
		List l2 = (List) Arrays.asList(arr2);

		merge(l1, l2);
	}

	public static void merge(List arr1, List arr2) {
		ArrayList newlist=new ArrayList();
	}

}
