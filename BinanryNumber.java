package com;

public class BinanryNumber {
	public static void main(String[] args) {
		String str = "1A1C0C1";
		int result = str.charAt(0) - '0';
		for (int i = 1; i < str.length(); i = i + 2) {
			char operator = str.charAt(i);
			int number = str.charAt(i + 1) - '0';
			if (operator == 'A') {
				result = result & number;

			} else if (operator == 'B') {
				result = result | number;

			} else if (operator == 'C') {
				result = result ^ number;

			}

		}
		System.out.println(result);

	}
}