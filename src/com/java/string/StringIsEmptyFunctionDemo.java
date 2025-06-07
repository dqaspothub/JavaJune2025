package com.java.string;

public class StringIsEmptyFunctionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = "Java Programming";
		String str2 = "";
		
		boolean test= str1.isEmpty();

		System.out.println(test); // false
		System.out.println(str2.isEmpty()); // true

	}
}