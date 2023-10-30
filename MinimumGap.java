package dsa;

import java.util.ArrayList;

public class MinimumGap {
	public static void main(String[] args) {
		int[] array = { 8, 1, 7, 4, 9, 7 };		
		System.out.println(minimumGap(array));
	}

	public static int minimumGap(int[] a) {
		ArrayList<Integer> listGap = new ArrayList<>();
		int minGap = Integer.MAX_VALUE;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					int gap = j - i;
					listGap.add(gap);					
					minGap = Math.min(minGap, gap);
				}
			}
		}
		if (listGap.isEmpty()) {
			return 0;
		}
		return minGap;
	}
}
