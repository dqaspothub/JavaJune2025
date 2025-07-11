package com.exception;

public class MultipleCatchBlocksExample {

	public static void main(String[] args) {
		try {
			int a = 10/0;
		    String s = null;
		    System.out.println(s.length());
		} 
		catch (ArithmeticException e) {
		    System.out.println("Math issue.");
		} catch (NullPointerException e) {
		    System.out.println("Null object!");
		}
		catch (Exception e) {
		    System.out.println("Something went wrong.");
		}

}}