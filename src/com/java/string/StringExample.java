package com.java.string;

public class StringExample {
	public static void main(String[] args) {
		String inputUsername = "  JohnDoe123 ";
		String registeredUsername = "johndoe123";

		// Step 1: Remove extra spaces
		inputUsername = inputUsername.trim();  // "JohnDoe123"

		// Step 2: Convert to lowercase for case-insensitive comparison
		inputUsername = inputUsername.toLowerCase();  // "johndoe123"

		// Step 3: Compare usernames
		if (inputUsername.equals(registeredUsername)) {
			System.out.println("Login successful!");
		} else {
			System.out.println("Invalid username.");
		}

		// Extra: Get username length
		System.out.println("Username length: " + inputUsername.length());

		// Extra: Check if it contains digits
		if (inputUsername.matches(".*\\d.*")) {
			System.out.println("Username contains numbers.");
		}

		// Extra: Replace part of string
		String masked = inputUsername.replace("123", "***");
		System.out.println("Masked Username: " + masked);
	}
}

