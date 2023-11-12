package dsa;

import java.util.HashSet;
import java.util.Set;

public class OddTimes {
	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4, 5, 6, 1, 2, 3, 4, 5, 100, 400, 15, 15, 15, 15, 15, 15, 15, 15 };
		Set<Integer> set = new HashSet<Integer>();
		for (int value : nums) {
			if(set.contains(value)) {
				set.remove(value);
				continue;
			}
			set.add(value);
			
		}
		for (Integer integer : set) {
			System.out.println(integer);
		}

	}
}