package com.java.methodConcepts;

public class Calculator {

	// Method with 2 int parameters
	public int add(int a, int b) {
		return a + b;
	}

	// Method with 3 int parameters
	public int add(int a, int b, int c) {
		return a + b + c;
	}

	// Method with different parameter types
	public double add(double a, double b) {
		return a + b;
	}

	// Method with different order
	public String add(String a, int b) {
		return a + b;
	}

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		System.out.println(calc.add(2, 3));           // 5
		System.out.println(calc.add(1, 2, 3));         // 6
		System.out.println(calc.add(2.5, 3.5));        // 6.0
		System.out.println(calc.add("Score: ", 100));  // Score: 100
	}
}
