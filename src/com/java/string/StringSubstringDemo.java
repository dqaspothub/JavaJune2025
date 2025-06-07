package com.java.string;

public class StringSubstringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = "java is fun";

		String text = str1.substring(5,7);
		
		System.out.println(text);

		// extract substring from index 0 to 3
		System.out.println(str1.substring(0, 4));

	}
}

// Output: java