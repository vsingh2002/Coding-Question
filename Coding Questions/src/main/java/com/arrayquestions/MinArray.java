package com.arrayquestions;

// Find minimum value in an array
public class MinArray {
	public static int minArray(int arr[]) {
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		return min;
	}

	public static void main(String[] args) {
		int arr[] = { 10, 20, 30, 40, 15, 35,5 };
		System.out.println("Minimum value in array is:" + minArray(arr));
	}

}
