package dsa;

import java.util.Scanner;

public class SquareRoot {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = scanner.nextInt();
		System.out.println("The square root of " + num + " is: " + squareRoot(num));
	}

	public static double squareRoot(int number) {
		double startNumber = 0;
		double endNumber = number;
		double midNumber = (startNumber + endNumber) / 2.0;
		double different = 0.01;
		while (Math.abs(number - (midNumber * midNumber)) > different) {
			if ((midNumber * midNumber) > number) {
				endNumber = midNumber;
			} else {
				startNumber = midNumber;
			}
			midNumber = (startNumber + endNumber) / 2.0;
		}
		return midNumber;
	}
}
