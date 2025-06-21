package com.java.constructor.example;

//Cons chainging using super

public class Parent {
	 Parent() 
	 {
	  // super(); // This statement calls Object class constructor.
	     System.out.println("I am parent constructor"); 
	 }
	}
	// Here, extends is used for developing inheritance between two classes.
	public class Child extends Parent {
	  Child() {
	  // super(); // This statement calls parent class constructor.
	     System.out.println("I am child constructor");
	  }
	public static void main(String[] args) {
	// Create an object of class.
	   Child c = new Child();
	  }
	}
