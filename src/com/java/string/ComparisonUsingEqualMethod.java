package com.java.string;

public class ComparisonUsingEqualMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "hello";
    	String s1 = "Hello";
    	String s2 = "Hello";
    	boolean b = s1.equals(s2);    //true
    	System.out.println(b);
    	b =	s.equals(s1) ;   //false
    	System.out.println(b);
	}

}
