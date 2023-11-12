package dsa;

import java.util.HashMap;

public class MinimumGap {
	public static void main(String[] args) {
		int[] array = { 7, 1, 3, 4, 1, 7 };
		System.out.println("Minimum Gap: " + minimumGap(array));
	}

	public static int minimumGap(int[] a) {
		HashMap<Integer, Integer> map = new HashMap<>();
		int minGap = Integer.MAX_VALUE;
		// {7:0; 1:1; 3:2; 4:3}
		for (int i = 0; i < a.length; i++) {
			if (map.containsKey(a[i])) {
				minGap = Math.min(minGap, i - map.get(a[i]));
			}
			map.put(a[i], i);
			// {7:5; 1:3; 3:2; 4:3}
		}
		return minGap;

	}
}
