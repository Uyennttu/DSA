package dsa;

public class FindAdditionalLettersInBlocks {
	public static void main(String[] args) {
		String S = "babaa"; // 4
		String S1 = "bbbab"; // 3
		String S2 = "bbbaaabbb"; // 3
		int numOfLetters = getAdditionalLetters(S);
		System.out.println("Number of Additional Letters: " + numOfLetters);
	}

	public static int getAdditionalLetters(String s) {
		int currentBlockLength = 1;
		int maxBlockLength = 0;
		int additionalLetters = 0;

		for (int i = 0; i < s.length() - 1; i++) {
			if (s.charAt(i) == s.charAt(i + 1)) {
				currentBlockLength++;
			} else {
				maxBlockLength = Math.max(maxBlockLength, currentBlockLength);
				currentBlockLength = 1;
			}
		}
		maxBlockLength = Math.max(maxBlockLength, currentBlockLength);
		System.out.println("Max Block: " + maxBlockLength);

		currentBlockLength = 1; 
		for (int i = 0; i < s.length() - 1; i++) {
			if (s.charAt(i) == s.charAt(i + 1)) {
				currentBlockLength++;
			} else {
				additionalLetters += maxBlockLength - currentBlockLength; 
				currentBlockLength = 1;
			}			
		}
		additionalLetters += maxBlockLength - currentBlockLength;
		return additionalLetters;
	}
}
