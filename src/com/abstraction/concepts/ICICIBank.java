package com.abstraction.concepts;

public class ICICIBank extends SBIBank{

	@Override
	public void Statement() {
		System.out.println("This is for ICICI Monthly report");
		
	}
	
	public static void main(String[] args) {

		RBI r = new ICICIBank();
		
		r.Statement();
		
		
	}

}
