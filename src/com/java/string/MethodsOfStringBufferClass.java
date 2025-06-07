package com.java.string;

public class MethodsOfStringBufferClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuffer str = new StringBuffer("test");
		
		str.append(123); // This method will concatenate the string representation of any type of data to the end of the StringBuffer object
		
		System.out.println(str);
		
		StringBuffer strr = new StringBuffer("test");
		
		strr.insert(2, 123); // This method inserts one string into another
		
		System.out.println(strr);
		
		StringBuffer str1 = new StringBuffer("Hello");
		str1.reverse();
		System.out.println(str1);
		
		StringBuffer str2 = new StringBuffer("Hello World");
		str2.replace( 6, 11, "java");
		System.out.println(str2);
		
	}

}
