package com.java.constructor;

public class ThisKeywordWorkingFlow {

	void msg() 
	{ 
		System.out.println(this); // It will print the same reference ID. 
	} 
	public static void main(String[] args) 
	{ 
		// Create an object of class Hi.
		ThisKeywordWorkingFlow h = new ThisKeywordWorkingFlow(); 
		System.out.println(h); // It will print the reference ID. 
		h.msg(); 
	} 
}
