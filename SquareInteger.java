package dsa;

import java.util.Scanner;

public class SquareInteger {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Number 1:");
		int num1 = scanner.nextInt();
		System.out.println("Number 2:");
		int num2 = scanner.nextInt();
		System.out.println("Square integers found between " + num1 + " and " + num2 + ":");
		findSquareInteger(num1, num2);
	}

	public static void findSquareInteger(int a, int b) {
		int squareA = (int) Math.ceil(Math.sqrt(a));
		int squareB = (int) Math.floor(Math.sqrt(b));
		if (squareA > squareB) {
			System.out.println("There are no square integers.");
			return;
		}
		for (int i = squareA; i <= squareB; i++) {
			System.out.println(i * i);
		}
	}
}
