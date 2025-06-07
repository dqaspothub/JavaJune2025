package com.java.string;

public class StringIntern {

	public static void main(String[] args) {
		
		String s1 = "Java";
		String s2 = "Java";
		String s3 = new String("Java");

		String s4= s3.intern();

		// Content comparison
		System.out.println(s1.equals(s2)); // true
		System.out.println(s1.equals(s3)); // true

		// Reference comparison
		System.out.println(s1 == s2); // true (same literal in SCP)
		System.out.println(s1 == s3); // false (s3 is in heap)
		System.out.println(s1 == s4); // true
	}
}

