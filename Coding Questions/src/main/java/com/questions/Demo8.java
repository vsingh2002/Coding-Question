package com.questions;

// Linear Search Implementation
import java.util.Scanner;

public class Demo8 {
	public static int linearSearch(int arr[], int n) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == n) {
				return i;
			}

		}
		return -1;
	}

	public static void main(String[] args) {
		int arr[] = { 10, 20, -2, 4, 7, 8, 34 };
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the key to find");
		int n = sc.nextInt();
		int result = linearSearch(arr, n);
		if (result != -1) {
			System.out.println("Element found at:" + result);
		} else {
			System.out.println("Element is not found");
		}
	}

}
