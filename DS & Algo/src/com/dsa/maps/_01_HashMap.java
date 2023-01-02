package com.dsa.maps;


import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


/*
	elements stored in Key/Value pair.
	
		
	
*/
public class _01_HashMap {

	public static void main(String[] args) {
		Map<String, Integer>  numbers=new HashMap<>();
		
		numbers.put("one", 1);
		numbers.put("two", 2);
		numbers.put("three", 3);
		
		numbers.put("one", 10);
		numbers.putIfAbsent("one", 11);
		
		System.out.println(numbers);
		
		System.out.println(numbers.get("three"));
		System.out.println(numbers.containsKey("one"));
		System.out.println(numbers.containsValue(2));
		System.out.println(numbers.containsValue(4));
		
		numbers.replace("one", 10, 1);
		numbers.remove("two");
		numbers.remove("three",4);
		
		System.out.println(numbers.keySet());
		System.out.println(numbers.values());
		System.out.println(numbers.entrySet());
		System.out.println(numbers);
		
		Set<Entry<String,Integer>> entries=numbers.entrySet();
		
		for(Entry<String, Integer> entry:entries) {
			entry.setValue(entry.getValue()*100);
		}
		System.out.println(numbers);
	}

}
