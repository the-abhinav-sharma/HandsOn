package com.handson;

import java.util.Arrays;

public class A1103Arrays {

	public static void main(String[] args) {
		String[] arr = { "Hello", "How", "are", "you", "Abhinav" };
	    Integer[] arr2 = { 12, 16, 44, 33, 992, 112, 322, 45, 99 };
		reverseArray(arr);
		reverseArray(arr2);

	}

	private static void reverseArray(Object[] arr) {
		// two pointer method of reversing an array

		int start = 0;
		int end = arr.length - 1;

		while (start < end) {
			swap(arr, start, end);
			start++;
			end--;
		}

		System.out.println("Reverse array : " + Arrays.toString(arr));
	}

	private static void swap(Object[] arr, int start, int end) {
		Object temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
		
	}
}
