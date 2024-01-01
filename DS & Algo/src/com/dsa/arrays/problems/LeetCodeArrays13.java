package com.dsa.arrays.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCodeArrays13 {

	public static void main(String[] args) {
		List<Integer> list = findDisappearedNumbers(new int[] { 4, 3, 2, 7, 8, 2, 3, 1 });
		System.out.println(list.toString());

		List<Integer> list2 = findDisappearedNumbers(new int[] { 1, 1 });
		System.out.println(list2.toString());

		List<Integer> list3 = findDisappearedNumbers(new int[] { 2, 2 });
		System.out.println(list3.toString());

	}

//	Input: nums = [4,3,2,7,8,2,3,1]
//	Output: [5,6]
	public static List<Integer> findDisappearedNumbers(int[] nums) {
		int l = nums.length;
		
		List<Integer> list = new ArrayList<>();
		Arrays.sort(nums);

		for (int i = 1; i <= l; i++) {
			int res = Arrays.binarySearch(nums, i);
			System.out.println("i in nums: " + i + "|| res: " + res);
			if (res >= 0)
				continue;
			list.add(i);

		}
		return list;
	}
}
