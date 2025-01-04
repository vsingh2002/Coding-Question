package com.questions;
// Generate the first n number in Fibonacci sequence
import java.util.Scanner;

public class Demo5 {
	public static void main(String[] args) {
		int firstNumber = 0;
		int secondNumber = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		System.out.print(firstNumber + " " + secondNumber);
		for (int i = 2; i < n; i++) {
			int nextNumber = firstNumber + secondNumber;
			System.out.print(" " + nextNumber);

			firstNumber = secondNumber;
			secondNumber = nextNumber;

		}

	}

}
