package com;

public class LinearSearchElement {
	public static String searchElement(int arr[], int n) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == n) {
				return "is found at" + i + "index";

			}

		}
		return "not found";
	}

	public static void main(String[] args) {
		int arr[] = { 1, 5, 8, 9, 10 };
		int n = 11;
		String result = LinearSearchElement.searchElement(arr, n);
		System.out.println(n + " " + result);
	}
}
