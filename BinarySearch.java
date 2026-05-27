package com;

public class BinarySearch {
	public static String searchElement(int n, int arr[]) {
		for (int i = 0; i < arr.length - 1; i++) {

			if (arr[i] > arr[i + 1]) {
				int temp = arr[i];
				arr[i] = arr[i + 1];
				arr[i + 1] = temp;

			}

		}
		for (int i : arr) {
			// System.out.println(arr);
		}
		int start = 0;
		int end = arr.length - 1;
		int mid = (start + end) / 2;

		while (start <= end) {
			mid = (start + end) / 2;
			if (arr[mid] == n) {
				return "found number at " + mid + "postion";

			}
			if (n > arr[mid]) {
				start = mid + 1;

			} else {
				end = mid - 1;
			}

		}
		return "number not found";
	}

	public static void main(String[] args) {
		int n = 1;
		int arr[] = { 1, 39, 2, 10 };

		String result = BinarySearch.searchElement(n, arr);
		System.out.println(result);
	}

}
