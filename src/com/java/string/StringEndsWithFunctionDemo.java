package com.java.string;

public class StringEndsWithFunctionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Java Programming";

		System.out.println(str.endsWith("mming")); // true
		System.out.println(str.endsWith("g")); // true
		System.out.println(str.endsWith("a Programming")); // true

		System.out.println(str.endsWith("programming")); // false
		System.out.println(str.endsWith("Java")); // false
	}
}