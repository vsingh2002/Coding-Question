package com.questions;

import java.util.Scanner;

// Reverse a String
public class Demo1 {
	public static void main(String[] args)

	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String s = sc.next();
		String rev = "";
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			rev = ch + rev;
		}
		System.out.println("Reverse String is :" + rev);
	}
}
