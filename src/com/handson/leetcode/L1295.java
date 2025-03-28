package com.handson.leetcode;

public class L1295 {

	public static void main(String[] args) {
		// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
//		Input: nums = [12,345,2,6,7896]
//		Output: 2
//		Input: nums = [555, 901, 482, 1771]
//		Output: 1

		System.out.println(findNumbers(new int[] { 555, 901, 482, 1771 }));
	}

	public static int findNumbers(int[] nums) {
		int evenCount = 0;
		for (int num : nums) {
			if (areDigitsEvenOptimized(num)) {
				evenCount++;
			}
		}
		return evenCount;
	}

	private static boolean areDigitsEven(int num) {
		int count = 0;
		if (num < 0)
			num = num * -1;
		if (num == 0)
			return false;
		while (num > 0) {
			num = num / 10;
			count++;
		}
		return count % 2 == 0;
	}

	private static boolean areDigitsEvenOptimized(int num) {
		return (int) (Math.log10(num) + 1) % 2 == 0;
	}

}
