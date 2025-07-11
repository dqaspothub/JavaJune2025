package com.abstraction.concepts;

public abstract class SBIBank extends RBI{

	@Override
	public void loan() {
		System.out.println("This my homeloan");		
	}

	public void kyc() {
		
		System.out.println("PAN card is required");
		
	}

}
