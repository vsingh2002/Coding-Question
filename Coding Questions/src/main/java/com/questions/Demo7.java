package com.questions;

// Binary Search Implementation
public class Demo7 {
	public static int binary(int nums[], int key) {
		int start = 0;
		int end = nums.length - 1;

		while (start <= end) {
			int mid = (start + end) / 2;

			if (nums[mid] == key) {
				return mid;
			} else if (nums[mid] < key) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}
		return -1;

	}

	public static void main(String[] args) {
		int nums[] = { 10, 20, 30, 40, 60 };
		int key = 70;
		System.out.println(Demo7.binary(nums, key));

	}

}
