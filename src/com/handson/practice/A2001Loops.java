package com.handson.practice;

public class A2001Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 4444
		// 4444
		// 4444
		// 4444

		int n = 7;

		pattern1(5);
		System.out.println();
		pattern2(3);
		System.out.println();
		pattern3(4);
		System.out.println();
		pattern4(4);
	}

	private static void pattern1(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(n);
			}
			System.out.println();
		}
	}
	
	private static void pattern2(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
	
	private static void pattern3(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
	
	private static void pattern4(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
