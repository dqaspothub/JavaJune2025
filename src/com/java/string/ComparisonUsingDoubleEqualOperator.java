package com.java.string;

public class ComparisonUsingDoubleEqualOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Java";
		
		String s2 = "Java";
			
		String s3 = new String ("Java");

		boolean b = (s1 == s2);
		System.out.println(b);
		b =	(s1 == s3);    
		System.out.println(b);

	}

}
