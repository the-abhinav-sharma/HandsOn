package com.handson.practice;

public class A0804OrderAgnosticBinarySearch {

	public static void main(String[] args) {
		int[] arr1 = { -12, -4, 0, 2, 5, 13, 16, 26, 66, 87 };// 6
		int[] arr2 = { -88, 75, 41, 22, 16, 9, 2, -10, -19 };// 4
		int target = 16;
		System.out.println(orderAgnosticBinarySearch(arr1, target));
		System.out.println(orderAgnosticBinarySearch(arr2, target));

	}

	// return the index
	// return -1 if it does not exist
	public static int orderAgnosticBinarySearch(int[] arr, int target) {
		int start = 0;
		int end = arr.length - 1;

		// find whether array is sorted in ascending or descending order
		boolean isAsc = arr[start] < arr[end];

		while (start <= end) {
			int mid = start + (end - start) / 2;

			if (arr[mid] == target) {
				return mid;
			}

			if (isAsc) {
				if (target < arr[mid]) {
					end = mid - 1;
				} else {
					start = mid + 1;
				}
			} else {
				if (target > arr[mid]) {
					end = mid - 1;
				} else {
					start = mid + 1;
				}
			}
		}
		return -1;
	}
}
