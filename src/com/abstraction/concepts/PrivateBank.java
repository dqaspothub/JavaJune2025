package com.abstraction.concepts;

public class PrivateBank implements RBIBank {

	public static void main(String[] args) {

		RBIBank text = new PrivateBank();
		Statebank sb = new Statebank();
		text.fdDeposit();
		text.RDDeposit();
		text.loanStatement();
		sb.fdDeposit();
		sb.RDDeposit();
		sb.loanStatement();
	}

	@Override
	public void loanStatement() {

		System.out.println("The private bank loanstatemnet");
	}

	@Override
	public void fdDeposit() {

		System.out.println("The FD deposit");

	}

	@Override
	public void RDDeposit() {
		System.out.println("The RD deposit");

	}
}
