package com.tka;

public class LongestString {
	public static void main(String[] args) {
//	Input:
//		Java is an object oriented programming language
//
//		Output:
//		programming
		String str = "Java is an object oriented programming language";
		String longStrings = "";
		String store = "";
		for (int i = 0; i < str.length(); i++) {
			
			if (str.charAt(i) != ' ') {
				store = store + str.charAt(i);

			} else {
				if (store.length()>longStrings.length()) {
					longStrings = store;
				}
				store = "";
			}
		}
		System.out.println(longStrings);

	}
}
