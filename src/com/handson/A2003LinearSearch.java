package com.handson;

public class A2003LinearSearch {

	public static void main(String[] args) {
		System.out.println(linearSearch(9, new int[] { 1, 5, 9, 1, 3, 2 }));
	}

	public static int linearSearch(int target, int[] array) {
		for (int index = 0; index < array.length; index++) {
			if (array[index] == target) {
				return index;
			}
		}
		return -1;
	}

}
