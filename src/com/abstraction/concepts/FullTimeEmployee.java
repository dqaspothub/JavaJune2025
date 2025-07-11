package com.abstraction.concepts;

class FullTimeEmployee extends Employee {
	FullTimeEmployee(String name) {
		super(name);
	}

	void calculateSalary() {
		salary = 50000;
		System.out.println("Full-time salary: " + salary);
	}
}

class PartTimeEmployee extends Employee {
	PartTimeEmployee(String name) {
		super(name);
	}

	void calculateSalary() {
		salary = 20000;
		System.out.println("Part-time salary: " + salary);
	}
}
