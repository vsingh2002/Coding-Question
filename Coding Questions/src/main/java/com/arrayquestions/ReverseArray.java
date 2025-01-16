package com.arrayquestions;

// Reverse Array
public class ReverseArray {
	public static void printArray(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void reverse(int arr[]) {
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

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5 };
		// int start=0;
		// int end=arr.length;
		// reverse(arr,0,arr.length-1);
		System.out.println("Before reverse");
		printArray(arr);
		System.out.println("After reverse");
		reverse(arr);
		printArray(arr);

	}

}
