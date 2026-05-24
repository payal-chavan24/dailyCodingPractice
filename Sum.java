package com;

public class Sum {
	public static void main(String[] args) {
		int n = 3;
		int m = 6;
		int sum1 = 0;
		int sum2 = 0;
		for (int i = 1; i <= m; i++) {
			if (i % n == 0) {
				sum1 = sum1 + i;

			} else {
				sum2 = sum2 + i;
			}

		}
		int result = sum2 - sum1;
		System.out.println(result);
	}
}
