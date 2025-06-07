package com.java.string;

public class StringEqualsFunctionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "Learn Java";
		String str2 = "Learn Java";
		String str3 = "Learn Kolin";
		boolean result;

		// comparing str1 with str2
		result = str1.equals(str2);
		System.out.println(result);  // true

		// comparing str1 with str3
		result = str1.equals(str3);

		System.out.println(result);  // false

		// comparing str3 with str1
		result = str3.equals(str1);
		System.out.println(result);  // false
	}
}