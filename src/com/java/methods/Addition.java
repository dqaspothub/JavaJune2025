package com.java.methods;

public class Addition {

	public static void additionOftwoNumbers(int a,int b) {

		int c = a+b;

		System.out.println("The addition of two numbers " + c);
	}

	public static void main(String[] args) {

		Addition.additionOftwoNumbers(10, 40); //Method calling


		Addition.additionOftwoNumbers(40, 40); //Method calling

	}

}
