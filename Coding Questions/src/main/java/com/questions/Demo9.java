package com.questions;

import java.util.Arrays;

// Reverse an Array
public class Demo9 {
	public static void reverseArray(int arr[]) {
		int start = 0;
		int end = arr.length - 1;
		while (start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}

	public static void main(String[] args) 
	{
		int arr[] = { 1, 2, 3, 4, 5 };
		System.out.println("Original array: " + Arrays.toString(arr));  // Print original array
        reverseArray(arr);  // Reverse the array
        System.out.println("Reversed array: " + Arrays.toString(arr)); // Print the reverse array 
	}

}
