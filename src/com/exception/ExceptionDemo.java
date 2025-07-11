package com.exception;

import java.io.File;
import java.util.Scanner;

public class ExceptionDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		System.out.println("Enter the number "+c);
		
		if(c>18) {

			System.out.println("You are eligible for vote");
		} else {
			System.out.println("You are not eligible to vote");
		}
	}

}
