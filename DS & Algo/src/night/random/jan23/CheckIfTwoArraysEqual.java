package night.random.jan23;

import java.util.HashMap;

public class CheckIfTwoArraysEqual {

	public static void main(String[] args) {
		long[] A= {1,2,4,3,6,5};
		long[] B= {1,2,3,4,5,6};
		
		System.out.println(check(A, B, 6));

	}
	public static boolean check(long A[],long B[],int N)
    {
        HashMap<Long, Integer> map=new HashMap<>();
        
        for(long key: A){
            if(map.containsKey(key)) {
            	map.put(key, map.get(key)+1);
            }
            else
            	map.put(key, 1);	
        }
        for(long key: B) {
        	if(map.containsKey(key)) {
        		if(map.get(key)>1)
        			map.put(key, map.get(key)-1);
        		else
        			map.remove(key);
        	}
        }
       if(map.isEmpty())
    	   return true;
       else
    	   return false;
    }
}
