package com.arrayquestions;

// Find second minimum value in array
public class SecondMinValue {
	// Finding second minimum method
	public static int secondMin(int arr[]) {
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		int secondMinimum = Integer.MAX_VALUE;
		for (int j = 0; j < arr.length; j++) {
			if (arr[j] < secondMinimum && arr[j] != min) {
				secondMinimum = arr[j];
			}
		}

		return secondMinimum;
	}

	public static void main(String[] args) {
		int arr[] = { 10, 20, -1, -4, 30 };
		System.out.println("Second minimum value in array is:" + secondMin(arr));

	}

}
