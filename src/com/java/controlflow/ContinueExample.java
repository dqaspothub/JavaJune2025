package com.java.controlflow;

public class ContinueExample {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
		    if (i == 3) {
		        System.out.println("Room " + i + " is locked, skipping...");
		        continue; // Skip this room
		    }
		    System.out.println("Cleaning room " + i);
		}

	}

}
