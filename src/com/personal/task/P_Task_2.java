package com.personal.task;

public class P_Task_2 {

	public static void main(String[] args) {
		int age = 18;  // You can change this value to test other cases

		if (age < 18) {
			System.out.println("Not eligible for vote.");
		} else if (age <= 65) {
			System.out.println("Eligible for vote.");
		} else {
			System.out.println("Senior citizen voter.");
		}
	}

}
