package com.May;

public class Pattern1 {
	public static void main(String[] args) {
// * * * * *
//  * * * * *
//    * * * * *
//      * * * * *
//        * * * * *
		int num = 5;
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j < i; j++) {
				System.out.print(" ");

			}
			for (int j = 1; j <= num; j++) {
				System.out.print("*");

			}
			System.out.println();

		}
//      * * * * *
//      *       *
//      *       *
//      *       *
//      * * * * *
		int n = 5;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {

				if (i == 1 || i == n || j == 1 || j == n) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}
			System.out.println();

		}

	}
}
