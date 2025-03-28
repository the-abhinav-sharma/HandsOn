package com.handson.leetcode;

public class L1672 {

	public static void main(String[] args) {
		// https://leetcode.com/problems/richest-customer-wealth/description/
		// { { 1, 5 }, { 7, 3 }, { 3, 5 } }; //10

		int[][] arr = { { 2, 8, 7 }, { 7, 1, 3 }, { 1, 9, 5 } };

		System.out.println(maximumWealth(arr));

	}

	private static int maximumWealth(int[][] accounts) {
		int maxSum = 0;
		for (int m = 0; m < accounts.length; m++) {
			int sum = 0;
			for (int n = 0; n < accounts[m].length; n++) {
				sum = sum + accounts[m][n];
			}
			if (sum == 0 || sum > maxSum) {
				maxSum = sum;
			}
		}
		return maxSum;
	}

}
