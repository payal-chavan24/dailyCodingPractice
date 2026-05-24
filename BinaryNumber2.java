package com;

public class BinaryNumber2 {
	public static void main(String[] args) {
		String str = "2a3b4c";
		String result = "";
		for (int i = 0; i < str.length(); i = i + 2) {
			int number = str.charAt(i) - '0';
			char alphabet = str.charAt(i + 1);
			for (int j = 1; j <= number; j++) {
				result = result + alphabet;

			}

		}
		System.out.println(result);
	}
}
