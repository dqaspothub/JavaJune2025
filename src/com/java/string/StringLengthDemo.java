package com.java.string;

public class StringLengthDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = " Kanna ";

		int lengthOfstring = str1.length();
		
		String afterTrim = str1.trim();
		
		String afterLowerCase = str1.toLowerCase();
		
		String afterUpperCase = str1.toUpperCase();

		System.out.println("The Lowercase of the string is " +afterLowerCase);

		System.out.println("The Upper of the string is " +afterUpperCase);

		System.out.println("The length of the string is " +lengthOfstring);
		
		System.out.println("Before the trim "+ str1);
		
		System.out.println("After the trim "+ afterTrim);
	}
}

// Output: 11
