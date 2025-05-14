package com.handson.practice;

import java.util.Arrays;

public class A1505BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 4, 2, 0, 3, -32, -9, 40, 11, 7 };
		bubbleSort(arr);
		System.out.println(Arrays.toString(arr));

	}

	static void bubbleSort(int[] arr) {
		boolean swapped = false;
		// run the steps n-1 times
		for (int i = 0; i < arr.length; i++) {
			swapped = false;
			// for each step, max item will come at the last respective index
			for (int j = 1; j < arr.length - i; j++) {
				// swap if the item is smaller than the previous item
				if (arr[j] < arr[j - 1]) {
					// swap
					int temp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = temp;
					swapped = true;
				}
			}

			// if swap did not happen for particular value of i, break the program
			if (!swapped) {
				break;
			}

		}

	}

}
