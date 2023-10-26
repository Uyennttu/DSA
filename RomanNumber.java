package dsa;

import java.util.Scanner;

public class RomanNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input: ");
		String s = scanner.nextLine();
		System.out.println("Output: " + romanToInt(s));
	}

	public static int convertValueFromCharacter(char romanChar) {
		switch (romanChar) {
		case 'I':
			return 1;
		case 'V':
			return 5;
		case 'X':
			return 10;
		case 'L':
			return 50;
		case 'C':
			return 100;
		case 'D':
			return 500;
		case 'M':
			return 1000;
		default:
			return -1;
		}
	}

	public static int romanToInt(String s) {
		int result = 0;
		int currentRomanValue = 0;
		int nextRomanValue = 0;
		for (int i = 0; i < s.length(); i++) {
			currentRomanValue = convertValueFromCharacter(s.charAt(i));
			if (i < s.length() - 1) { 
				nextRomanValue = convertValueFromCharacter(s.charAt(i + 1));				
			}
			if (currentRomanValue < nextRomanValue) {
				result -= currentRomanValue;
			} else {
				result += currentRomanValue;
			}
		}
		return result;
	}
}
