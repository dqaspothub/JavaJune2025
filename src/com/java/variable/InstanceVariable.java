package com.java.variable;

// Like name tags given to each student – each student has a different tag.

public class InstanceVariable {

    String name; // instance variable

    public void showName() {
        System.out.println("Student name: " + name);
    }
    
    public static void main(String[] args) {
     
    	InstanceVariable ref2 = new InstanceVariable();
    	ref2.name="kanna";
    	ref2.showName();
    	
    }
}
