package com.java.array;

import java.util.Arrays;

public class ArrayExample {

	public static void main(String[] args) {
		
		//WithoutArrray

		int book1 = 300;
		int book2 = 450;
		int book3 = 250;
		int book4 = 500;
		int book5 = 350;

		//💡 Problem: Managing multiple variables gets messy if we need 100 or more books!

		int[] bookPrices = {300, 450, 250, 500, 350};

		int[] numbers1 = {10, 20, 30, 40, 50};  // Values assigned directly
		
		int[] numbers2 = new int[5]; // Creates an array of size 5
		
		numbers2[0] = 10;  // Assign values one by one
		numbers2[1] = 20;
		numbers2[2] = 30;
		numbers2[3] = 40;
		numbers2[4] = 50;

		
		int[] nums = {10, 20, 30};
		
		System.out.println(nums.length);  // 3

		String[] names = {"Alice", "Bob", "Charlie"};
		
		System.out.println(names.length);  // 3
		
		int[] marks = {85, 90, 78, 92, 88};
		
		for (int i = 0; i < marks.length; i++) {

			System.out.println("Student " + (i + 1) + " scored: " + marks[i]);
		}



	}
}