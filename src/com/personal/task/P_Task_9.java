package com.personal.task;

public class P_Task_9 {

	// Area of square
	public void area(int side) {
		System.out.println("Area of square: " + (side * side));
	}

	// Area of rectangle
	public void area(int length, int breadth) {
		System.out.println("Area of rectangle: " + (length * breadth));
	}

	// Area of circle
	public void area(double radius) {
		System.out.println("Area of circle: " + (Math.PI * radius * radius));
	}

	public static void main(String[] args) {
		P_Task_9 ac = new P_Task_9();
		ac.area(5);               // square
		ac.area(4, 6);            // rectangle
		ac.area(3.5);             // circle
	}
}
