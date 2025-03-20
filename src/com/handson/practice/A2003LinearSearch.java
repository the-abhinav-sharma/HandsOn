package com.handson.practice;

public class A2003LinearSearch {

	public static void main(String[] args) {
		System.out.println(linearSearch(9, new int[] { 1, 5, 9, 1, 3, 2 }));

		System.out.println(minValue(new int[] { 352331, 12345, 433219, 4484, 33214, 24322 }));
		
		System.out.println(maxValue(new int[] { 331, 125, 439, 484, 314, 242 }));
	}

	public static int linearSearch(int target, int[] array) {
		for (int index = 0; index < array.length; index++) {
			if (array[index] == target) {
				return index;
			}
		}
		return -1;
	}

	public static int minValue(int[] array) {
		int min = array[0];
		for (int index = 0; index < array.length; index++) {
			if (array[index] < min) {
				min = array[index];
			}
		}
		return min;
	}
	
	public static int maxValue(int[] array) {
		int max = array[0];
		for (int index = 0; index < array.length; index++) {
			if (array[index] > max) {
				max = array[index];
			}
		}
		return max;
	}

}
