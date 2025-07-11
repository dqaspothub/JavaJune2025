package com.exception;

public class AgeValidator {
    static void checkAge(int age) throws IllegalArgumentException {
        if (age < 18)
            throw new IllegalArgumentException("You must be 18+");
    }

    public static void main(String[] args) {
        try {
            checkAge(15);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
