package com.questions;

import java.util.Scanner;

// Check Prime number 
public class Demo6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		int count = 1;
		for (int i = 2; i <= n; i++) {
			if (n % i == 0) {
				count++;
			}
		}
		if (count == 2) {
			System.out.println("Number is prime");
		} else {
			System.out.println("Number is not prime");
		}
	}

}
