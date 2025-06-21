package com.java.constructor;

public class Student {

	// Declare instance variables. 
	String name; 
	int rollno; 

	// Declare a parameterized constructors with two parameters name and rollno. 
	// Here, name and rollno are local variables. 
	Student(String name, int rollno) 
	{ 
		// Here, the parameter's identifier is the same as that of the instance variables name. 
		name = name; 
		rollno = rollno; 
	} 
	void display() 
	{ 
		System.out.println(name+ " "+rollno); 
	} 
	public static void main(String[] args) 
	{ 
		// Create an object of class Student and call the display() method using reference variable s. 
		Student s = new Student("Kannathasan", 123); 
		s.display(); 
	} 
}
