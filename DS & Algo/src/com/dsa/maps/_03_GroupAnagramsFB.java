package com.dsa.maps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;


/* 
 Input: strs = ["eat","tea","tan","ate","nat","bat"]
 Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
 */
public class _03_GroupAnagramsFB {

	public static void main(String[] args) {
		String str[]= {"eat","tea","tan","ate","nat","bat"};
		
		System.out.println(groupAnagram(str));
	}
	public static List<List<String>> groupAnagram(String []strs){
//		Map<String,List<String>> map=new HashMap<>();
//		
//		for(String s:strs) {
//			char charArr[]=s.toCharArray();
//			Arrays.sort(charArr);
//			String sorted=new String(charArr);
//			
//			if(!map.containsKey(sorted)) {
//				map.put(sorted, new LinkedList<String>());
//			}
//			
//			map.get(sorted).add(s);
//			
//		}
//		return new LinkedList<>(map.values());
		
		 Map<String, List<String>> map = new HashMap<>();
	        
	        for(String str : strs){
	            char[] chars = str.toCharArray();
	            Arrays.sort(chars);
	            String s = new String(chars);
	            if(map.containsKey(s)){
	               map.get(s).add(str);
	            }else{
	                List<String> list = new ArrayList<>();
	                list.add(str);
	                map.put(s, list);
	            }
	        }
	        List<List<String>> ans = new ArrayList<>();
	        for(String s : map.keySet()){
	            ans.add(map.get(s));
	            
	        }
	        return ans;
	}
}
