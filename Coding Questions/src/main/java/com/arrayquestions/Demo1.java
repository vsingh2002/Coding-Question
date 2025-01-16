package com.arrayquestions;

import java.util.Arrays;

// Given an array of integers return an array with even integers removed
public class Demo1 {
	public static int[] removeEven(int arr[]) {
		int oddCount = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0) {
				oddCount++;
			}
		}
		int result[] = new int[oddCount];
		int idx = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0) {
				result[idx] = arr[i];
				// Increase index to fill new element
				idx++;
			}
		}
		return result;

	}

	public static void main(String[] args) {
		int arr[] = { 3, 2, 4, 7, 10, 6, 5 };
		System.out.println(Arrays.toString(removeEven(arr)));

	}

}
