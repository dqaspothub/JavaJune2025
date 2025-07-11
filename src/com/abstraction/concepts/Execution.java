package com.abstraction.concepts;

public class Execution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		Employee e1 = new FullTimeEmployee("John");
		e1.showDetails();
		e1.calculateSalary();

		Employee e2 = new PartTimeEmployee("Doe");
		e2.showDetails();
		e2.calculateSalary();
	}
}


