package dsa;

import java.util.Arrays;

public class CommonPrefix {
	public static void main(String[] args) {
		String[] array = { "flowers", "flow", "flight" };
		String[] array1 = { "dog", "racecar", "car" };
		System.out.println("The longest common prefix is: " + longestCommonPrefix(array1));
	}

	public static String longestCommonPrefix(String[] string) {
		Arrays.sort(string);
		String first = string[0]; 
		String last = string[string.length - 1]; 
		int count = 0;
		if (first.charAt(count) != last.charAt(count)) {
			return "None";
			}
		while (count < first.length() && first.charAt(count) == last.charAt(count)) {
			count++;
		}
		return first.substring(0, count);
	}
}
