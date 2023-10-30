package dsa;

import java.util.ArrayList;
import java.util.Arrays;

public class OddTimes {
	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 6, 1, 2, 3, 4, 5, 100, 400, 15, 15, 15, 15, 15, 15, 15, 15 };
		Arrays.sort(array); // Onlogn
		int currentNum = array[0];
		int count = 0;
		ArrayList<Integer> oddTimesNumbers = new ArrayList<>(); // On

		for (int num : array) { //On
			if (num == currentNum) {
				count++;
			} else {
				if (count % 2 != 0) {
					oddTimesNumbers.add(currentNum);
				}
				currentNum = num;
				count = 1;
			}
		}
		if (count % 2 != 0) {
			oddTimesNumbers.add(currentNum);
		}

		System.out.println("Found: ");
		for (int num : oddTimesNumbers) {
			System.out.println(num + " ");
		}
	}
}
//Time: Onlogn
//Space: On
