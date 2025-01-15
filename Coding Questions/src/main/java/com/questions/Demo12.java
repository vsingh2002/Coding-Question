package com.questions;

// Find Duplicate element in an Array
public class Demo12 {
	public static int duplicateNumber(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					return arr[i];
				}
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5,3 };
		System.out.println("Duplicate element is:" + duplicateNumber(arr));
	}

}
