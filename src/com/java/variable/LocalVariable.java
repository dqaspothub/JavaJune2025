package com.java.variable;

//Like a temporary note you write during a phone call and throw away afterward.

public class LocalVariable {

	public void greet() {

		String name = "Kirthika"; // local variable

		System.out.println("Hello, " + name);
	}
	
	public static void main(String[] args) {

		LocalVariable ref1 = new LocalVariable();
		ref1.greet();

	}
}
