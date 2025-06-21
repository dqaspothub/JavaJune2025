package com.java.methodConcepts;

public class MethodOverloadingDemo {

	public static int Addition(int a,int b) {
		
		int c = a+b;

		return c;
	}

	public static int Addition(int d,float e) {

	
		int f = (int) (d+e);
		
		return f;

	}

	public static void main(String[] args) {

		int newvar = MethodOverloadingDemo.Addition(8,9);
		
		System.out.println(newvar+10);
		
		MethodOverloadingDemo.Addition(19,90.0f);
	}

}
