package com.abstraction.concepts;

public class Statebank implements RBIBank,Bank {

	@Override
	public void loanStatement() {
		System.out.println("Home loan  loanStatement");		
	}

	@Override
	public void fdDeposit() {
		System.out.println("FD");		

	}

	@Override
	public void RDDeposit() {
		System.out.println("RD");		

	}

	@Override
	public void kyc() {

		System.out.println("This a user Kyc form");
	}

}
