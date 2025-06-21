package com.java.constructor;

public class ContructorConcept {

	private String name;

	  // constructor
	ContructorConcept() {
	    System.out.println("Constructor Called:");
	    name = "Kanna";
	  }

	  public static void main(String[] args) {

	    // constructor is invoked while
	    // creating an object of the Main class
		  ContructorConcept obj = new ContructorConcept();
	    System.out.println("The name is " + obj.name);
	  }
	}