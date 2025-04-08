package com.handson.practice;

public class A0804BinarySearch {

	public static void main(String[] args) {
		int[] arr = { -12, -4, 0, 2, 5, 13, 19, 26, 66, 87 };
		int target = 0;
		int ans = binarySearch(arr, target);
		System.out.println(ans);

	}

	// return the index
	// return -1 if it does not exist
	// Assumption:array is sorted in ascending order
	public static int binarySearch(int[] arr, int target) {
		int start = 0;
		int end = arr.length - 1;

		while (start <= end) {
			// find the middle element
			// int mid = (start+end)/2; //to prevent size overrun of int
			int mid = start + (end - start) / 2;

			if (target < arr[mid]) {
				end = mid - 1;
			} else if (target > arr[mid]) {
				start = mid + 1;
			} else {
				// ans found
				return mid;
			}
		}
		return -1;
	}
}
