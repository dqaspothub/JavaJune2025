package com.java.string;

public class BufferExample {
	
	public static void main(String[] args) {
		
		StringBuffer sb1 = new StringBuffer();
		
		sb1.append("abnjklougdfrthj1aabnjklougdfrthj1a");
		
		System.out.println(sb1.capacity());
		
		StringBuffer sb = new StringBuffer("Hello");

		System.out.println(sb.capacity());
			

		// default capacity is 16
		
		sb.ensureCapacity(100);

		//String str = sb;

		String str=sb.toString();

		System.out.println(str);

		System.out.println(sb.deleteCharAt(3));

		sb.append(" World");
		System.out.println(sb); // Output: Hello World

		sb.insert(6, "Java ");
		System.out.println(sb); // Output: Hello Java World

		sb.replace(6, 10, "Python");
		System.out.println(sb); // Output: Hello Python World

		sb.reverse();
		System.out.println(sb); // Output: dlroW nohtyP olleH
	}
}
