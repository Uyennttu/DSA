package dsa;

public class CommonPrefix {
	public static void main(String[] args) {
		String[] array = { "flowers", "flow", "flight" };
		String[] array1 = { "dog", "racecar", "car" };
		int min = getShortestString(array);
		String minString = getCommonPrefix(array, min);
		System.out.println("The longest common prefix is: " + minString);
	}

	public static int getShortestString(String[] string) {
		int shortestString = string[0].length();
		int shortestStringIndex = 0;
		for (int i = 0; i < string.length; i++) {
			if (string[i].length() < shortestString) {
				shortestString = string[i].length();
				shortestStringIndex = i;
			}
		}
		return shortestStringIndex;
	}

	public static String getCommonPrefix(String[] string, int shortestStringIndex) {
		String prefix = "";
		for (int i = 0; i < string[shortestStringIndex].length(); i++) {
			char c = string[shortestStringIndex].charAt(i);
			for (int j = 0; j < string.length; j++) {
				if (j == shortestStringIndex) {
					continue;
				}
				if (string[j].charAt(i) != c) {
					return prefix;
				}
			}
			prefix += c;
		}
		return prefix;
	}
}

// O(n*m)
// for smaller number of strings
// Arrays.sort(string)- On^2logn
