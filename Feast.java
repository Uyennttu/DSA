package dsa;

import java.util.Scanner;

public class Feast {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter n:");
		int n = scanner.nextInt();
		System.out.println("Enter c:");
		int c = scanner.nextInt();
		System.out.println("Enter m:");
		int m = scanner.nextInt();
		int result = theFeast(n, c, m);
		System.out.println("He has eaten " + result + " bars.");
	}

	public static int theFeast(int n, int c, int m) {
		int bars = n / c;
		int wrappers = bars;
		while (wrappers >= m) {
			int newBars = wrappers / m;
			bars += newBars;
			wrappers = wrappers % m + newBars;
		}
		return bars;
	}
}
