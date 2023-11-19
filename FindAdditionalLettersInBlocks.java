package dsa;

public class FindAdditionalLettersInBlocks {
	public static void main(String[] args) {
		String S = "babaa"; // 4- 3
		String S1 = "bbbab"; // 3 -4
		String S2 = "bbbaaabbb"; // 3 -0

		System.out.println("Number of Additional Letters: " + getAdditionalLetters(S));
		System.out.println("Number of Additional Letters: " + getAdditionalLetters(S1));
		System.out.println("Number of Additional Letters: " + getAdditionalLetters(S2));
	}

	public static int getAdditionalLetters(String s) {
		int countBlock = 1;
		int max = 0;
		int additionalLetters = 0;
		int countChar = 1;

		for (int i = 0; i < s.length() - 1; i++) {
			if (s.charAt(i) != s.charAt(i + 1)) {
				countBlock++;
				max = Math.max(countChar, max);
				countChar = 1;
			} else {
				countChar++;
			}
		}
		max = Math.max(countChar, max);
		additionalLetters = max * countBlock - s.length();

		return additionalLetters;
	}
}
