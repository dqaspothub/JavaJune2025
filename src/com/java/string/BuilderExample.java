package com.java.string;

public class BuilderExample {

	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder("Data");
		sb.append(" Science");
		System.out.println(sb);  // Output: Data Science

		sb.delete(0, 5);
		System.out.println(sb);  // Output:Science
	}
}
