package com.personal.task;

public class P_Task_5 {
	public static void main(String[] args) {
		int marks = 85; // You can change this value to test different cases

		if (marks < 50) {
			System.out.println("Fail");
		} else if (marks > 50 && marks < 60) {
			System.out.println("D Grade");
		} else if (marks >= 60 && marks < 70) {
			System.out.println("C Grade");
		} else if (marks >= 70 && marks < 80) {
			System.out.println("B Grade");
		} else if (marks >= 80 && marks < 90) {
			System.out.println("A Grade");
		} else if (marks >= 90 && marks < 100) {
			System.out.println("A+ Grade");
		} else {
			System.out.println("Invalid marks");
		}
	}
}
