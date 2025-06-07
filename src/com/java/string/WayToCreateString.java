package com.java.string;

public class WayToCreateString {

	public static void main(String[] args) {

		// 1. String Literal (Preferred for memory efficiency)
		String s1 = "Hello";  
		String s2 = "Hello";  // Reuses the same object from String Pool

		// 2. Using 'new' Keyword (Creates a new object in Heap)
		String s3 = new String("Hello");  
		String s4 = new String("Hello");  // Creates a new object each time
		
	}

}
