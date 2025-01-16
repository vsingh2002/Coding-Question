package com.arrayquestions;

// Find maximum value in an array
public class MaxValue {
	public void maxValue(int arr[]) {
		int max = arr[0];
		for (int i = 0; i < arr.length ; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println("Maximum value in array is:" + max);
	}

	public static void main(String[] args) {
		int arr[] = { 10, 20, 30, 5, 7,50 };
		MaxValue mx = new MaxValue();
		mx.maxValue(arr);
	}

}
