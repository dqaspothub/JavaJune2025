package com.java.controlflow;

public class DoWhileLoopExample {

	public static void main(String[] args) {


		int timer = 5;

		while (timer >= 0) {
			System.out.println("Brushing... Seconds left: " + timer);
			timer--;
		}

	}
}