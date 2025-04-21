package com.handson.practice;

public class A2204Floor {

	public static void main(String[] args) {
		int arr[] = {2,3,5,9,14,16,18};//{14,16,18}//{14}
		int target = 10;
		System.out.println(arr[floor(arr,target)]);
	}

	
	public static int floor(int[] arr, int target) {
		int start = 0;
		int end = arr.length - 1;

		while (start <= end) {
			// find the middle element
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
		return end;
	}

}
