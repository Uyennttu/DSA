package dsa;

import java.util.Arrays;

public class Sort {
	public static void main(String[] args) {
		int[] array1 = { 1, 2, 2, 0, 0, 1, 2, 2, 1 };
		int[] array2 = { 0, 0, 1, 1, 1, 2, 2, 2, 2 };
		int[] sort = sortArray(array1);
		System.out.println(Arrays.toString(sort));		
	}

	public static int[] sortArray(int[] array) {
		int countZero = 0;
		int countOne = 0;
		for (int num : array) {
			if (num == 0) {
				countZero++;
			} else if (num == 1) {
				countOne++;
			}
		}
		int[] result = new int[array.length];
		for (int i = countZero; i < (countZero + countOne); i++) {
			result[i] = 1;
		}
		for (int i = (countZero + countOne); i < result.length; i++) {
			result[i] = 2;
		}
		return result;
	}
}
