package com.exception;

public class DivideExample {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Can't divide by zero.");
        } finally {
            System.out.println("Cleanup done.");
        }
    }
}
