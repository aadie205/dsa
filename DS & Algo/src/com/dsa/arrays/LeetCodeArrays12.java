package com.dsa.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class LeetCodeArrays12 {

	public static void main(String[] args) {
		System.out.println(thirdMax(new int[] {2,2,3,1})); //1

	}

    public static int thirdMax(int[] nums) {
    	Set<Integer> set=new HashSet<Integer>();
    	
    	for(int element: nums) {
    		set.add(element);
    		if(set.size()>3) {
    			set.remove(Collections.min(set));
    		}
    	}
    	if(set.size()==3)
    		return Collections.min(set);
    	
    	return Collections.max(set);
    	
    }
}
