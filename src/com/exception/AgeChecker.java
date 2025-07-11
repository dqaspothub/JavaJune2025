package com.exception;


//Step 1: Define Custom Exception
class InvalidAgeException extends RuntimeException {
	public InvalidAgeException(String message) {
		super(message);
	}
}

//Step 2: Use it in your logic
public class AgeChecker {
	public static void checkAge(int age) throws InvalidAgeException {
		if (age < 18) {
			throw new InvalidAgeException("You must be 18 or older.");
		}
	}

	public static void main(String[] args) {

		try {
			checkAge(16);
		} catch (InvalidAgeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
