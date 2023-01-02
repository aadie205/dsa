package com.dsa.strings;

import java.util.HashMap;

public class SortingTheSequence {

	public static void main(String[] args) {
//		String s = "is2 sentence4 This1 a3";
		String s = "Myself2 Me1 I4 and3";
		
		System.out.println(sortSentence(s));
	}
	
	public static String sortSentence(String s) {
        String str[]=s.split(" ");
        
        HashMap<Integer, String> hm=new HashMap<>();
        
        for(String st: str){
            int key=Character.getNumericValue(st.charAt(st.length()-1));
            String val=st.substring(0, st.length()-1);

            hm.put(key, val);
        }
        StringBuilder sb=new StringBuilder();
        
        for(int i=1;i<=str.length;i++){
            if(sb.length()==0){

                sb.append(hm.get(i));
            }
            else{
                sb.append(" ");
                sb.append(hm.get(i));
            }
        }
        return sb.toString();
    }
}
