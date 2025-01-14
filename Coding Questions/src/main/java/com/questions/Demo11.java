package com.questions;

//Find Unique Number in an Array 
public class Demo11 {
	public static int finduniqueNumber(int arr[]) {
		int ans = 0;
		for (int i = 0; i < arr.length; i++) {
			ans = ans ^ arr[i];
		}
		return ans;
	}

	public static void main(String[] args) {
		int arr[] = { 1, 3, 4, 3, 1 };
		System.out.println("Unique Number in array :" + finduniqueNumber(arr));

	}

}
