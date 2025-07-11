package com.exception;

class BusinessRuleException extends RuntimeException {
    public BusinessRuleException(String message) {
        super(message);
    }
}

public class Example {
    public static void validate(String input) {
        if (input == null || input.isEmpty()) {
            throw new BusinessRuleException("Input cannot be null or empty.");
        }
    }

    public static void main(String[] args) {
        validate("");  // No try-catch needed for unchecked
    }
}
