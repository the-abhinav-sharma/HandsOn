package com.handson.practice;

public class A1103Loops {

	public static void main(String[] args) {
		countDigitsInNumber(143214211, 1);
		reverseNumber(123009);

	}

	private static void reverseNumber(int number) {
		int originalNumber = number;
		int reverse = 0;
		while (number > 0) {
			int remainder = number % 10;
			number = number / 10;
			reverse = reverse * 10 + remainder;
		}
		System.out.println("Reverse of " + originalNumber + " = " + reverse);
	}

	private static void countDigitsInNumber(int number, int digitToBeChecked) {
		// count number of digits in a number
		int originalNum = number;
		int count = 0;
		while (number > 0) {
			int rem = number % 10; // 4
			if (rem == digitToBeChecked) {
				count++;
			}
			number = number / 10;
		}
		System.out.println("Number of " + digitToBeChecked + "'s in " + originalNum + " = " + count);
	}

}
