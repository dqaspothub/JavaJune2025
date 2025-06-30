package com.personal.task;

class Calculator {

	// Overloaded add methods
	public int add(int a, int b) {
		return a + b;
	}

	public int add(int a, int b, int c) {
		return a + b + c;
	}

	public double add(double a, double b) {
		return a + b;
	}

	public String add(String a, int b) {
		return a + b;
	}

	// Overloaded multiply methods
	public int multiply(int a, int b) {
		return a * b;
	}

	public double multiply(int a, double b) {
		return a * b;
	}

	public int multiply(int a, int b, int c) {
		return a * b * c;
	}
}

public class P_Task_8 {
	public static void main(String[] args) {
		Calculator calc = new Calculator();

		System.out.println("Adding two integers: " + calc.add(10, 20));
		System.out.println("Adding three integers: " + calc.add(10, 20, 30));
		System.out.println("Adding two doubles: " + calc.add(2.3, 3.4));
		System.out.println("Adding String with integer: " + calc.add("Result", 25));

		System.out.println("Multiplying two integers: " + calc.multiply(10, 20));
		System.out.println("Multiplying integer with double: " + calc.multiply(10, 3.0));
		System.out.println("Multiplying three integers: " + calc.multiply(10, 20, 30));
	}
}
