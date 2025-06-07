package com.java.string;

public class StringImmutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name ="kanna";

		name = name + "thasan";
		System.out.println("hello " + name);

		String s1 ="Kanna";
		String s2 ="Kanna";
		String s3 ="Kanna";
		String s4 = new String ("kanna");

		System.out.println(s1==s4);
		
		System.out.println(s1.equalsIgnoreCase(s4));
	}

}
