package com.java.constructor;

public class ContructorOverloadingDemo {
	
	// Declaring a non-parameterized constructor.
	ContructorOverloadingDemo() { 
	      System.out.println("Introduction:");
	   }
	// Declaring one parameterized constructor.
	ContructorOverloadingDemo(String name){
	     System.out.println("Name: " +name);	
	   }
	// Declaring two parameterized constructor.
	ContructorOverloadingDemo(String scname, int rollNo) {
		 System.out.println("School name: "+scname+ ", "+"Roll no:"+rollNo);
	   }
	public static void main(String[] args) 
	{
	// JVM will call constructor depending on arguments passed.
		ContructorOverloadingDemo p1 = new ContructorOverloadingDemo(); // calling with zero argument.
		ContructorOverloadingDemo p2 = new ContructorOverloadingDemo("John"); // calling with one argument.
		ContructorOverloadingDemo p3 = new ContructorOverloadingDemo("DPS", 12); // calling with two arguments.
	 }
	}

