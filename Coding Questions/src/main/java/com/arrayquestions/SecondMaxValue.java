package com.arrayquestions;

// Find second maximum value in array
public class SecondMaxValue {
	public static int secondMax(int arr[]) {
		int max = arr[0];
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		int secondMax = -1;
		for (int j = 0; j < arr.length - 1; j++) {
			if (arr[j] > secondMax && arr[j] != max) {
				secondMax = arr[j];
			}

		}
		return secondMax;

	}

	public static void main(String[] args) {
		int arr[] = { 10, 20, 30, 40, 50, 45 };
		System.out.println("Second max value in array:" + secondMax(arr));
	}

}
