package com.java.string;

public class StringToCharArrayDemo {

	public static void main(String[] args) {

		String name = "Kanna";

		char[] nameToChar = name.toCharArray();

		int lengthOfChar= nameToChar.length;

		System.out.println(lengthOfChar);

		//Method 1

		for (char test : nameToChar) {

			System.out.println(test);

		}

		//Method 2

		for (int i=lengthOfChar-1;i>=0;i--) {

			System.out.println(nameToChar);

		}
	}

}


