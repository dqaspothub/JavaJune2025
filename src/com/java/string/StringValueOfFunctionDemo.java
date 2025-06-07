package com.java.string;

public class StringValueOfFunctionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 5;
		long l = -2343834L;
		float f = 23.4f;
		double d = 923.234d;
		
		// convert numbers to strings
		System.out.println(String.valueOf(a));  // "5"
		System.out.println(String.valueOf(l));  // "-2343834"
		System.out.println(String.valueOf(f));  // "23.4"

		System.out.println(String.valueOf(d));  // "923.234"
		
		System.out.println("------------------------");
		
		char c = 'J';
						
	    char ch[] = {'J', 'a', 'v', 'a'};

	    // convert char to string
	    System.out.println(String.valueOf(c));  // "J"


	    // convert char array to string
	    System.out.println(String.valueOf(ch));  // "Java"
	}
}