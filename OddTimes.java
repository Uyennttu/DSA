package dsa;

import java.util.ArrayList;
import java.util.List;

public class OddTimes {
	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 6, 1, 2, 3, 4, 5, 100, 400, 15, 15, 15, 15, 15, 15, 15, 15 }; // 21
		List<Integer> oddTimesNumbers = findOddTimes(array);
		System.out.println("Found: " + oddTimesNumbers);
	}

	public static List<Integer> findOddTimes(int[] array) {
		int maxValue = findMaxValue(array);
		int[] new_array = new int[maxValue + 1];
		for (int value : array) {
			new_array[value]++;
		}
		List<Integer> oddTimesNumbers = new ArrayList<>();
		for (int i = 0; i < new_array.length; i++) {
			if (new_array[i] % 2 != 0) {
				oddTimesNumbers.add(i);
			}
		}
		return oddTimesNumbers;
	}

	public static int findMaxValue(int[] n) {
		int max = n[0];
		for (int value : n) {
			if (value > max) {
				max = value;
			}
		}
		return max;
	}
}
