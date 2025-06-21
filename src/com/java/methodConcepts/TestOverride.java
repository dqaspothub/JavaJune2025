package com.java.methodConcepts;

class Animal {
	public void sound() {
		System.out.println("Animal makes a sound");
	}
}

class Dog extends Animal {
	@Override
	public void sound() {
		
		//super.sound();
		System.out.println("Dog barks");
	}
}

public class TestOverride {
	public static void main(String[] args) {
		Animal a = new Dog();  // Upcasting
		a.sound();             // Dog barks (runtime decision)
	}
}
