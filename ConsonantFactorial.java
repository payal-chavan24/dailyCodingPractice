package com;

public class ConsonantFactorial {
	public static void main(String[] args) {
		String str = "abcdefghi";
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'o' || ch == 'u' || ch == 'i') {
				count++;

			}

		}
		int consonant = str.length() - count;
		//System.out.println(consonant);
		int fact = 1;
		for (int i = consonant; i > 0; i--) {
			fact = fact * i;

		}
		System.out.println("Factorial " + consonant + " is =" + fact);
	}
}
