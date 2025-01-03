package com.questions;

import java.util.Scanner;

// Check for Palindrome String
public class Demo3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String st = sc.next();
		String palin = st;
		String rev = "";
		for (int i = 0; i < st.length(); i++) {
			char ch = st.charAt(i);
			rev = ch + rev;
		}
		if (rev.equals(palin)) {
			System.out.println("The string is palindrome ");
		} else {
			System.out.println("The string is not palindrome");
		}
	}

}
