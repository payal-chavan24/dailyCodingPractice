package com;

public class StrongNumber {
	public static void main(String[] args) {

		int n = 145;
		int temp = n;
		int sum = 0;
		while (n > 0) {
			int digit = n % 10;
			int fact = 1;
			for (int i = 1; i <= digit; i++) {
				fact = fact * i;

			}
			sum = sum + fact;
			n = n / 10;

		}
		System.out.println(sum);
		if (temp == sum) {
			System.out.println("Strong number");

		} else {
			System.out.println("It is not Strong number");
		}
	}
}
