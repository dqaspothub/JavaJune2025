package com.java.methods;

public class Coffee {

	public void makeCoffee() {
	    System.out.println("Grinding coffee beans...");
	    System.out.println("Boiling water...");
	    System.out.println("Brewing coffee...");
	    System.out.println("Serving coffee...");
	}
	
	public void makeCoffee(boolean addSugar, boolean addMilk) {
	    System.out.println("Grinding coffee beans...");
	    System.out.println("Boiling water...");
	    System.out.println("Brewing coffee...");
	    if (addSugar) {
	        System.out.println("Adding sugar...");
	    }
	    if (addMilk) {
	        System.out.println("Adding milk...");
	    }
	    System.out.println("Serving coffee...");
	}


}
