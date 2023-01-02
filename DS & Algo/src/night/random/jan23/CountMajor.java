package night.random.jan23;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CountMajor {

	public static void main(String[] args) {
		int[] a = new int[] { 3, 2, 3 };
		int[] a1= {1,2,321,2,2,1,1,1,2,1,1,2,2};
		majorityElement(a1);
		majorityElement(a);
	}

	public static int majorityElement(int[] nums) {
		Map<Integer, Integer> map = new HashMap<>();
		int count = 0;
		int val=0;
		
		for (int e : nums) {
			if (map.size() == 0) {
				map.put(e, 1);
			} else {
				if (map.containsKey(e)) {
					map.put(e, map.get(e) + 1);
				} else {
					map.put(e, 1);
				}
			}
		}
		
		for(Map.Entry<Integer, Integer> entry: map.entrySet()) {
			if(entry.getValue()>count) {
				count=entry.getValue();
				val=entry.getKey();
			}
		}
//		System.out.println(count);
		System.out.println(val);
		return 0;
	}
}
