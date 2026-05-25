package com;

public class StringPeresent {

//	Given an array of strings and a target string,
//	return "yes" if the target string exists in the array,
//			otherwise return "no".
	public static String checkin() {
		String arr[] = { "neha", "payal", "shital", "rahul" };
		String str = "shital";
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equals(str)) {
				return "yes";
			}

		}
		return "no";
	}

	public static void main(String[] args) {
		String check = StringPeresent.checkin();
		System.out.println(check);
	}
}
