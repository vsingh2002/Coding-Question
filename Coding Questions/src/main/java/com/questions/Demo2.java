package com.questions;

// Find the largest element in Array
public class Demo2 {
	public static void main(String[] args) 
	{
		int arr[] = { 60, 20, 30, 40, 50 };
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) 
		{
			if (arr[i] > max) 
			{
				max = arr[i];
			}
		}
		System.out.println("Largest Element in array is:" + max);

	}

}
